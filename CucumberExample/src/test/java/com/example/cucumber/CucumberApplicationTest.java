package com.example.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "offer.feature",plugin = {"pretty","html:target/cucmber-reports","json:target/cucumber.json"} )
public class CucumberApplicationTest {


    @Test
    void contextLoads() {
    }
}
