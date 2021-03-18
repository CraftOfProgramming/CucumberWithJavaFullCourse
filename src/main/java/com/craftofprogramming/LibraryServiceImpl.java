package com.craftofprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService {
    private final BookDAO bookDAO;

    public LibraryServiceImpl(boolean preLoadBooks) {
        this.bookDAO = new BookDAO();
        if (preLoadBooks) {
            this.bookDAO.parseLibraryFrom(BookDAO.DEFAULT_PATH);
        }
    }

    @Override
    public List<Book> getSortedComputingBooksByTitle() {
        return bookDAO.getLibrary()
                .stream()
                .filter(b -> b.getTopic() == Topic.COMPUTING)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Topic> mostPopularTopic() {
        return bookDAO.getLibrary()
                .stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    @Override
    public List<String> getBookTitles() {
        return bookDAO.getLibrary()
                .stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    @Override
    public Book getBookWithTitle(String title) {
        for (Book book : bookDAO.getLibrary()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Map<Topic, List<Book>> booksByTopic() {
        return bookDAO.getLibrary()
                .stream()
                .collect(Collectors.groupingBy(Book::getTopic));
    }

    @Override
    public Map<Topic, Long> bookCountByTopic() {
        return bookDAO.getLibrary()
                .stream()
                .collect(Collectors.groupingBy(Book::getTopic, Collectors.counting()));
    }

    @Override
    public int bookCount() {
        return bookDAO.getLibrary()
                .size();
    }

    @Override
    public void add(Book book) {
        bookDAO.getLibrary().add(book);
    }

    @Override
    public void clear() {
        this.bookDAO.getLibrary().clear();
    }
}