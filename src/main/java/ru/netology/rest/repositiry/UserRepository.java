package ru.netology.rest.repositiry;

import org.springframework.stereotype.Repository;
import ru.netology.rest.authorities.Authorities;
import ru.netology.rest.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(User user) {
        List<Authorities> authorities= new ArrayList<>();
        if (user.getName().equals("admin") && user.getPassword().equals("pass12")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.getName().equals("assistant") && user.getPassword().equals("asdf")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.getName().equals("user") && user.getPassword().equals("12345")) {
            Collections.addAll(authorities, Authorities.READ);
        } else
            return Collections.emptyList();
        return authorities;
    }
}
