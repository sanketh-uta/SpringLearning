package com.sanbro.PracticalExamples.ExpenseTrackerWithAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExpenseService {
    @Autowired
    private Expense expense;

    List<String> expenses = new ArrayList<>();


    public void addExpense(boolean isPersonAllowed){
        if(!isPersonAllowed)
            throw new RuntimeException("Person is not allowed to add the expenses");
        expenses.add("grocery");
        expenses.add("Education fees");
        expenses.add("skills development");
        System.out.println(expenses);
    }
}
