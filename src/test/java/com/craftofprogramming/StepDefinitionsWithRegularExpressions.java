package com.craftofprogramming;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class StepDefinitionsWithRegularExpressions {

    private LibraryService library;
    private Book book;
    private Topic mostPopularTopic;

//    @Given("^that my library is initialized$")
//    public void thatMyLibraryIsInitialized() {
//        library = TestContext.INSTANCE.getLibraryService(true);
//    }
//
//    @Given("^that my library is initialized empty$")
//    public void thatMyLibraryIsInitializedEmpty() {
//        library = TestContext.INSTANCE.getLibraryService(false);
//    }
//
////    @When("^I search for the book with title .*$")
//    @When("^I search for the book with title \"(.*)\"$")
//    public void iSearchForTheBookWithTitle(String title) {
//        book = library.getBookWithTitle(title);
//    }
//
//    @Then("^I find the book \"(.*)\"$")
//    public void iFindTheBook(String title) {
//        assertThat(library.getBookWithTitle(title).getTitle(), is(equalTo(title)));
//    }
//
//    @When("^I search for the most popular topic$")
//    public void iSearchForTheMostPopularTopic() {
//        mostPopularTopic = library.mostPopularTopic().get();
//    }
//
////    @Then("^I find the topic .*$")
//    @Then("^I find the topic (.*)$")
//    public void iFind(Topic topic) {
//        assertThat(mostPopularTopic, is(equalTo(topic)));
//    }
//
//    @And("^that the total number of books is (\\d+)$")
//    public void thatTheTotalNumberOfBooksIs(int totalNrOfBooks) {
//        assertThat(library.bookCount(), is(equalTo(totalNrOfBooks)));
//    }
//
//    @But("^I don't find the topic (.*)$")
//    public void iDonTFindTheTopic(Topic topic) {
//        assertThat(mostPopularTopic, is(not(equalTo(topic))));
//    }
//
////    @When("^I search for the book with title .* and topic .*$")
//    @When("^I search for the book with title \"(.*)\" and topic (.*)$")
//    public void iSearchForTheBookWithTitleAndTopicNOVEL(String title, Topic topic) {
//        book = library.getBookWithTitle(title);
//        Assert.assertNotNull(book);
//        assertThat(book.getTopic(), is(equalTo(topic)));
//    }
//
//    @Then("^I have (\\d+) book[s]? with topic (.*) in my library$")
//    public void iHaveBooksWithTopicCOMPUTINGInMyLibrary(int nrOfBooks, Topic topic) {
//        final Map<Topic, List<Book>> booksByTopic = library.booksByTopic();
//        assertThat(booksByTopic.get(topic)
//                .size(), is(equalTo(nrOfBooks)));
//    }
//
//    @Then("^I have (\\d+) title[s]? with topic (.*) in my library$")
//    public void iHaveBooksWithTopicCOMPUTINGInMyLibraryBar(int nrOfBooks, Topic topic) {
//        final Map<Topic, List<Book>> booksByTopic = library.booksByTopic();
//        assertThat(booksByTopic.get(topic)
//                .size(), is(equalTo(nrOfBooks)));
//    }
//
//    @Given("^An example of an escape sequence \\(yay!\\)$")
//    public void anExampleOfAnEscapeSequenceYay() {
//        System.out.println("library = " + library);
//    }
//
//    @DataTableType
//    public Book bookDefinition(Map<String, String> entry) {
//        return new Book(
//                entry.get("title")
//                        .trim(),
//                Integer.parseInt(entry.get("Number of Pages")
//                        .trim()),
//                Topic.valueOf(entry.get("Topic")
//                        .trim()),
//                Year.parse(entry.get("Year of Publication")
//                        .trim()),
//                entry.get("Authors")
//        );
//    }
//
//    @DocStringType(contentType = "list_of_books")
//    public List<Book> bookDefinitionWithDocString(String docString) {
//        List<Book> books = new ArrayList<>();
//        Arrays.stream(docString.split("\\n"))
//                .forEach(e -> {
//                    final String[] split = e.split(",");
//                    books.add(new Book(
//                            split[0].trim(),
//                            Integer.parseInt(split[1].trim()),
//                            Topic.valueOf(split[2].trim()),
//                            Year.parse(split[3].trim()),
//                            split[4].trim()
//                    ));
//                });
//        return books;
//    }
//
//    @And("^the following table of books:$")
//    public void theFollowingTableOfBooks(List<Book> books) {
//        library = TestContext.INSTANCE.getLibraryService(false);
//        books.forEach(b -> library.add(b));
//    }
//
//    @And("^the following list of books:$")
//    public void theFollowingListOfBooks(List<Book> books) {
//        library = TestContext.INSTANCE.getLibraryService(false);
//        books.forEach(b -> library.add(b));
//    }
//
//    @ParameterType(".*")
//    public Book book(String bookMetaData) {
//        final String[] split = bookMetaData.split(",");
//        return new Book(
//                split[0].trim(),
//                Integer.parseInt(split[1].trim()),
//                Topic.valueOf(split[2].trim()),
//                Year.parse(split[3].trim()),
//                split[4].trim()
//        );
//    }
//
//    @ParameterType("COMPUTING|SCI_FI|FINANCE|NOVEL")
//    public Topic Topic(String topic) {
//        return Topic.valueOf(topic);
//    }
//
//    @When("I add the book {book}")
//    public void iAddTheBook(Book book) {
//        library.add(book);
//    }
//
//    @Given("^I have (\\d+) cucumber in my belly$")
//    public void iHaveCucumbersInMyBelly(int dCucumberCount) {
//        System.out.println("dCucumberCount = " + dCucumberCount);
//    }
//
//    @Given("^I have (\\d+(\\.\\d+)?) cucumbers in my belly$")
//    public void iHaveCucumbersInMyBellyBar(double dCucumberCount) {
//        System.out.println("dCucumberCount = " + dCucumberCount);
//    }
//
//    @Given("^This is (\\d+) Byte$")
//    public void thisIsByte(Byte bParam) {
//        System.out.println("bParam = " + bParam);
//    }
//
//    @Given("^This is (\\d+) Short$")
//    public void thisIsByte(Short shortParam) {
//        System.out.println("shortParam = " + shortParam);
//    }
//
//    @Given("^This is (\\d+) Integer$")
//    public void thisIsByte(Integer integerParam) {
//        System.out.println("integerParam = " + integerParam);
//    }
//
//    @Given("^This is (\\d+) Long$")
//    public void thisIsByte(Long longParam) {
//        System.out.println("longParam = " + longParam);
//    }
//
//    @Given("^This is (\\d+(\\.\\d+)?) Float$")
//    public void thisIsByte(Float floatParam) {
//        System.out.println("floatParam = " + floatParam);
//    }
//
//    @Given("^This is (\\d+(\\.\\d+)?) Double$")
//    public void thisIsByte(Double doubleParam) {
//        System.out.println("doubleParam = " + doubleParam);
//    }
//
//    @Given("^This is (\\d+) BigInteger$")
//    public void thisIsByte(BigInteger bigIntegerParam) {
//        System.out.println("bigIntegerParam = " + bigIntegerParam);
//    }
//
//    @Given("^This is (.*) BigDecimal$")
//    public void thisIsByte(BigDecimal bigDecimalParam) {
//        System.out.println("bigDecimalParam = " + bigDecimalParam);
//    }
//
//    @Given("^I am (\".*\")$")
//    public void iAm(String names) {
//        System.out.println("names = " + names);
//    }
//
//    @Given("^My first name is (\"\\b.*\\b\")$")
//    public void myFirstNameIs(String name) {
//        System.out.println("name = " + name);
//    }
//
//    @Given("^My last name is (\\'\\b.*\\b\\')$")
//    public void myLastNameIsNilton(String name) {
//        System.out.println("name = " + name);
//    }
}
