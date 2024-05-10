package com.testexam.question_2.aspect;

import com.testexam.question_2.controller.ConflictException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApiAspect {

    @AfterThrowing(value = "execution(* com.testexam.question_2.controller.*.*(..))", throwing = "ex")
    public void handleConflictException(JoinPoint joinPoint, ConflictException ex) {
        String message = ex.getReturnCode() + ": " + ex.getReturnDesc();
        System.out.println(message + "- " + HttpStatus.CONFLICT);
    }
}
