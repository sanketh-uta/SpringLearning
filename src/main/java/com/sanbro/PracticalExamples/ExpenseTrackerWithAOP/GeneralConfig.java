package com.sanbro.PracticalExamples.ExpenseTrackerWithAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.sanbro.PracticalExamples.ExpenseTrackerWithAOP")
@Configuration
@EnableAspectJAutoProxy
public class GeneralConfig {
}
