package ru.netology.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.netology.rest.authorities.Authorities;
import ru.netology.rest.service.AuthorizationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

}
