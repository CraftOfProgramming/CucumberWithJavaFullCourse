package com.craftofprogramming;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepResultsStepDefs {

    @When("A step result is Success")
    public void anStepResultIsSuccess() {
        System.out.println("StepResultsStepDefs.anStepResultIsSuccess");
    }

    @Then("Life is good!")
    public void lifeIsGood() {
        System.out.println("StepResultsStepDefs.lifeIsGood");
    }

    @When("A step result Fails")
    public void anStepResultFails() {
        System.out.println("StepResultsStepDefs.anStepResultFails");
        throw new RuntimeException("An step result Fails");
    }

    @Then("Life is not good!")
    public void lifeIsNotGood() {
        System.out.println("StepResultsStepDefs.lifeIsNotGood");
    }

    @When("A step result is Pending")
    public void aStepResultIsPending() {
        throw new PendingException("This step is in pending completion");
    }

    @When("This step {}")
    public void aStepResultIsAmbiguous(String result) {
        System.out.println("result = " + result);
    }

    @When("This step is Ambiguous")
    public void anStepResultIsAmbiguousV1() {
        System.out.println("StepResultsStepDefs.anStepResultIsAmbiguousV1");
    }
}
