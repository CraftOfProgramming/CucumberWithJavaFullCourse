package com.craftofprogramming;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface LibraryService {
    static LibraryService getService(boolean preLoad) {
        return new LibraryServiceImpl(preLoad);
    }

    List<Book> getSortedComputingBooksByTitle();

    Optional<Topic> mostPopularTopic();

    List<String> getBookTitles();

    Book getBookWithTitle(String title);

    Map<Topic, List<Book>> booksByTopic();

    Map<Topic, Long> bookCountByTopic();

    int bookCount();

    void add(Book book);

    void clear();
}
