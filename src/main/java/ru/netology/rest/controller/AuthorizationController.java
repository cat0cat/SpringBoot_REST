package ru.netology.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import ru.netology.rest.authorities.Authorities;
import ru.netology.rest.model.LoginUser;
import ru.netology.rest.model.User;
import ru.netology.rest.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@AllArgsConstructor
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping(value = "/authorize")
    public List<Authorities> getAuthorities(@Valid @LoginUser User user) {
        return service.getAuthorities(user);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    String resolveException (MethodArgumentNotValidException ex) {
        return ex.getMessage();
    }


}
