package app.mock;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private final List<User> users = new ArrayList<>();

    {
        users.add(new User("Ivan", "ivan@example.com"));
        users.add(new User("Maria", "petro123@example.com"));
        users.add(new User("Petro", "maria@example.com"));
        users.add(new User("Olena", "123olena@example.com"));
        users.add(new User("Dmytro", "sergiy@example.com"));
    }

    public List<User> getUsers() {
        return users;
    }
}