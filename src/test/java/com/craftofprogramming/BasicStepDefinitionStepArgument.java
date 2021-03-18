package com.craftofprogramming;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BasicStepDefinitionStepArgument {

    private LibraryService service;

    @DataTableType
    public Book bookDefinition(Map<String, String> entry) {
        return new Book(
                entry.get("title")
                        .trim(),
                Integer.parseInt(entry.get("Number of Pages")
                        .trim()),
                Topic.valueOf(entry.get("Topic")
                        .trim()),
                Year.parse(entry.get("Year of Publication")
                        .trim()),
                entry.get("Authors")
        );
    }

    @DocStringType(contentType = "list_of_books")
    public List<Book> bookDefinitionWithDocString(String docString) {
        List<Book> books = new ArrayList<>();
        Arrays.stream(docString.split("\\n"))
                .forEach(e -> {
                    final String[] split = e.split(",");
                    books.add(new Book(
                            split[0].trim(),
                            Integer.parseInt(split[1].trim()),
                            Topic.valueOf(split[2].trim()),
                            Year.parse(split[3].trim()),
                            split[4].trim()
                    ));
                });
        return books;
    }

    @And("the following table of books:")
    public void theFollowingTableOfBooks(List<Book> books) {
        service = TestContext.INSTANCE.getLibraryService();
        books.forEach(b -> service.add(b));
    }

    @And("the following list of books:")
    public void theFollowingListOfBooks(List<Book> books) {
        service = TestContext.INSTANCE.getLibraryService();
        books.forEach(b -> service.add(b));
    }

    @ParameterType(".*")
    public Book book(String bookMetaData) {
        final String[] split = bookMetaData.split(",");
        return new Book(
                split[0].trim(),
                Integer.parseInt(split[1].trim()),
                Topic.valueOf(split[2].trim()),
                Year.parse(split[3].trim()),
                split[4].trim()
        );
    }

    @ParameterType("COMPUTING|SCI_FI|FINANCE|NOVEL")
    public Topic Topic(String topic) {
        return Topic.valueOf(topic);
    }

    @When("I add the book {book}")
    public void iAddTheBook(Book book) {
        TestContext.INSTANCE.getLibraryService().add(book);
    }
}
