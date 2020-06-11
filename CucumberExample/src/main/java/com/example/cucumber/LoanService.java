package com.example.cucumber;

public class LoanService {
    public String getLoan(int salary) {
        String loanAmount = "";
        if (salary > 15000 && salary < 25000) {
            loanAmount = "50000";
        } else if (salary > 50000) {
            loanAmount = "100000";
        }
        else{
            loanAmount="NA";
        }
        return loanAmount;
    }
}
