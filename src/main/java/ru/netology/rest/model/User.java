package ru.netology.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Getter
@AllArgsConstructor
public class User {

    @Size(min = 3,max = 12)
    @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_\\.]{3,12}$", message =" Имя пользователя - неправильный формат")
    private String name;

    @Size(min = 4)
    @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_\\.]{4,16}$", message =" пароль - неправильный формат")
    private String password;

}
