package com.sanbro.PracticalExamples.ExpenseTrackerWithAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GeneralConfig.class);
        ExpenseService expenseService = context.getBean(ExpenseService.class);
        boolean isPersonAllowed = true;
        expenseService.addExpense(isPersonAllowed);
    }
}
