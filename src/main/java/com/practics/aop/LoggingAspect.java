package com.practics.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {

    // This advice will be executed before any method in the service layer
    @Before("execution(* com.practics.aop.PaymentServiceImpl.makePayment())")
    public void logBeforeMethodCall() {
        System.out.println("Method is about to be called");
    }
}
