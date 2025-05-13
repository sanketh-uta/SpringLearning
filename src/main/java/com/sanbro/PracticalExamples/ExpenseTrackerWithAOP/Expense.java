package com.sanbro.PracticalExamples.ExpenseTrackerWithAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Expense {

    private List<String> expenseName;

    public List<String> getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(List<String> expenseName) {
        this.expenseName = expenseName;
    }
}
