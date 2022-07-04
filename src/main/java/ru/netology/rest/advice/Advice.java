package ru.netology.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.rest.exceptions.InvalidCredentials;
import ru.netology.rest.exceptions.UnauthorizedUser;

@RestControllerAdvice ("ru.netology.rest")
public class Advice {

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidCredentials.class)
    public String HandlerInvalidCredentials (InvalidCredentials ex) {
        return "Error " + HttpStatus.BAD_REQUEST +": "+ ex.getMessage();
    }

    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    public String HandleUnauthorizedUser (UnauthorizedUser ex) {
        System.out.println("Error " + HttpStatus.UNAUTHORIZED +": "+ ex.getMessage());
        return "Error " + HttpStatus.UNAUTHORIZED +": "+ ex.getMessage();
    }
}
