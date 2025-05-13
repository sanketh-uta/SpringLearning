package com.sanbro.AspectOrientedProgramming;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.LocalTime;

@Aspect
@Component
public class AspectConfig {
    private static final Logger logger = LoggerFactory.getLogger(AspectConfig.class);

//    @Before("execution(* com.sanbro.AspectOrientedProgramming.VehicleService.*(..))")
//    public void log() {
//        logger.info("This is executing before the method calls");
//    }
//    @After("execution(* com.sanbro.AspectOrientedProgramming.VehicleService.*(..))")
//    public void logAfter() {
//        logger.info("This is executing after the method calls");
//    }
    @Around("execution(* com.sanbro.AspectOrientedProgramming.VehicleService.*(..))")
    public Object timeTaken(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        logger.info(joinPoint.getSignature().getName() + " took " + (end-start) + " to execute");
        return result;
    }

}
