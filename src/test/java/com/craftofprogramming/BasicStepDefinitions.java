package com.craftofprogramming;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicStepDefinitions {

    private LibraryService library;
    private Book book;
    private Topic mostPopularTopic;

    @Given("that my library is initialized")
    public void thatMyLibraryIsInitialized() {
        library = TestContext.INSTANCE.initializeLibraryService(true);
    }

    @Given("that my library is initialized empty")
    public void thatMyLibraryIsInitializedEmpty() {
        library = TestContext.INSTANCE.initializeLibraryService(false);
    }

    @When("I search for the book with title {string}")
    public void iSearchForTheBookWithTitle(String title) {
        book = library.getBookWithTitle(title);
    }

    @Then("I find the book {string}")
    public void iFindTheBook(String title) {
        assertThat(library.getBookWithTitle(title).getTitle(), is(equalTo(title)));
    }

    @When("I search for the most popular topic")
    public void iSearchForTheMostPopularTopic() {
        mostPopularTopic = library.mostPopularTopic()
                .get();
    }

    @Then("I find the topic {Topic}")
    public void iFind(Topic topic) {
        assertThat(mostPopularTopic, is(equalTo(topic)));
    }

    @And("that the total number of books is {int}")
    public void thatTheTotalNumberOfBooksIs(int totalNrOfBooks) {
        assertThat(library.bookCount(), is(equalTo(totalNrOfBooks)));
    }

    @But("I don't find the topic {Topic}")
    public void iDonTFindTheTopic(Topic topic) {
        assertThat(mostPopularTopic, is(not(equalTo(topic))));
    }

    @When("I search for the book with title {string} and topic {Topic}")
    public void iSearchForTheBookWithTitleAndTopicNOVEL(String title, Topic topic) {
        book = library.getBookWithTitle(title);
        Assert.assertNotNull(book);
        assertThat(book.getTopic(), is(equalTo(topic)));
    }

    @Then("I have {int} book(s)/title(s) with topic {Topic} in my library")
    public void iHaveBooksWithTopicCOMPUTINGInMyLibrary(int nrOfBooks, Topic topic) {
        final Map<Topic, List<Book>> booksByTopic = library.booksByTopic();
        assertThat(booksByTopic.get(topic)
                .size(), is(equalTo(nrOfBooks)));
    }

    @Given("An example of an escape sequence \\(yay!)")
    public void anExampleOfAnEscapeSequenceYay() {
        System.out.println("library = " + library);
    }

//    @Before()
//    public void setUp() {
//        System.out.println("BasicStepDefinitions.cleanUp");
//        TestContext.INSTANCE.getLibraryService(false).clear();
//    }

//    @After
//    public void cleanUp() {
//        System.out.println("BasicStepDefinitions.cleanUp");
//        TestContext.INSTANCE.getLibraryService(false).clear();
//    }
}
