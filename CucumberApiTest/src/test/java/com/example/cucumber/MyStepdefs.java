package com.example.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;


public class MyStepdefs{
    @Given("^Execute Get request by \"([^\"]*)\"$")
    public void executeGetRequestBy(String arg0) throws Throwable {
    given().contentType(ContentType.JSON);

    }

    @When("^i will pass the path variable \"([^\"]*)\"$")
    public void iWillPassThePathVariable(String arg0) throws Throwable {
        when().get(String.format("http://localhost:8081/stock/getdata/%s",arg0)).
                then().body("name",is("starbucks"));

    }

    @Then("^i should get the same name \"([^\"]*)\"$")
    public void iShouldGetTheSameName(String arg0) throws Throwable {

    }
}
