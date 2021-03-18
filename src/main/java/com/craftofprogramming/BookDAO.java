package com.craftofprogramming;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses each line of a csv file containing a list of books onto a Book object and runs
 * a simple query against it.
 */
public class BookDAO {

    public static Path DEFAULT_PATH = Paths.get("src/main/resources/books.csv");
    private List<Book> library = new ArrayList<>();

    public void parseLibraryFrom(Path path) {
        this.library = Utils.parseLibraryFrom(path);
    }

    public List<Book> getLibrary() {
        return library;
    }

    public static void main(String[] args) {
        final BookDAO bookDAO = new BookDAO();
        bookDAO.parseLibraryFrom(DEFAULT_PATH);
    }
}
