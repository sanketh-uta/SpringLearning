package com.sanbro.PracticalExamples.ExpenseTrackerWithAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class LoggingAspect {
    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    @Before(value = "execution(* com.sanbro.PracticalExamples.ExpenseTrackerWithAOP.ExpenseService.addExpense(..)) && args(isPersonAllowed)",
            argNames = "isPersonAllowed")
    public void loggingMethodName(JoinPoint joinPoint,boolean isPersonAllowed){
        logger.info("Excecuting this method before "+ joinPoint.getSignature().getName() +
                " and the parameter passed is "+isPersonAllowed);
    }
    @AfterThrowing(value = "execution(* com.sanbro.PracticalExamples.ExpenseTrackerWithAOP.ExpenseService.addExpense(..)) && args(isPersonAllowed)",
            argNames = "isPersonAllowed", throwing = "e")
    public void loggingException(JoinPoint joinPoint, boolean isPersonAllowed, Exception e){
        if(!isPersonAllowed){
            logger.warn("Exception occured while executing the "+joinPoint.getSignature().getName() + e.getMessage());
        }
    }
    @Around(value = "execution(* com.sanbro.PracticalExamples.ExpenseTrackerWithAOP.ExpenseService.addExpense(..))")
    public void loggingWhileExecuting(ProceedingJoinPoint joinPoint) throws Throwable{
        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant end  = Instant.now();
        logger.info(joinPoint.getSignature().getName()+" method took "+ Duration.between(start,end).toMillis()+" milli seconds to complete execution");
    }
    @AfterReturning(value = "execution(* com.sanbro.PracticalExamples.ExpenseTrackerWithAOP.ExpenseService.addExpense(..))")
    public void loggingAfterReturning(JoinPoint joinPoint){
        logger.info("This is executing after the complete successful execution");
    }
    @After(value = "execution(* com.sanbro.PracticalExamples.ExpenseTrackerWithAOP.ExpenseService.addExpense(..))")
    public void loggingAfterMethodExecution(JoinPoint joinPoint){
        logger.info("This will be executed even if the exception is thrown");
    }
}
