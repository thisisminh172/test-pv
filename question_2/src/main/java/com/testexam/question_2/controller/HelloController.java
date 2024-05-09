package com.testexam.question_2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class HelloController {
    @GetMapping("hello")
    public void hello() {
        throw new ConflictException("409");
    }

    @ExceptionHandler(ConflictException.class)
    public void handleConflictException() {
        throw new ResponseStatusException(HttpStatus.CONFLICT);
    }
}
