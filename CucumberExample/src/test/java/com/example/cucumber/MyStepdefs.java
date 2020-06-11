package com.example.cucumber;

import com.example.cucumber.LoanService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    LoanService loanservice=null;
    String salary="";
    @Given("^create  LoanService$")
    public void createLoanService() {
    loanservice=new LoanService();
    }

    @When("^if i enter salary  (\\d+)$")
    public void ifIEnterSalary(int arg0) {
      salary= loanservice.getLoan(arg0);
    }

    @Then("^we can give fifty thousand loan$")
    public void weCanGiveFiftyThousandLoan() {
        Assert.assertEquals("5000",salary);
    }

    @Then("^we can give one lakh loan$")
    public void weCanGiveOneLakhLoan() {
        Assert.assertEquals("100000",salary);

    }

    @Then("^No loan$")
    public void noLoan() {
        Assert.assertEquals("NA",salary);
    }
}
