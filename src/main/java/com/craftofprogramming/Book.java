package com.craftofprogramming;

import java.time.Year;
import java.util.*;

public class Book {
    private final String title;
    private final int pageCount;
    private final Topic topic;
    private final Year publicationDate;
    private final List<String> authors;

    public Book(String title, int pageCount, Topic topic, Year publicationDate, String... authors) {
        this.title = title;
        this.pageCount = pageCount;
        this.topic = topic;
        this.publicationDate = publicationDate;
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Topic getTopic() {
        return topic;
    }

    public Year getPublicationDate() {
        return publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                title.equals(book.title) &&
                topic == book.topic &&
                publicationDate.equals(book.publicationDate) &&
                authors.equals(book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, topic, publicationDate, authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", topic=" + topic +
                ", publicationDate=" + publicationDate +
                ", authors=" + authors +
                '}';
    }
}
