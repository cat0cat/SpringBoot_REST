package ru.netology.rest.repositiry;

import org.springframework.stereotype.Repository;
import ru.netology.rest.authorities.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities= new ArrayList<>();
        if (user.equals("admin") && password.equals("pass")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("assistant") && password.equals("asdf")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("123")) {
            Collections.addAll(authorities, Authorities.READ);
        } else
            return Collections.emptyList();
        return authorities;
    }
}
