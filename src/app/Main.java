package app;

import app.entity.User;
import app.mock.UserData;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Init UserData
        UserData userData = new UserData();
        List<User> userList = userData.getUsers();
//        filtered user
        List<User> filteredUsers = userList.stream()
                .filter(user -> user.getEmail().contains("123"))
                .toList();
        System.out.println("Filtered users:");
        for (User user : filteredUsers) {
            System.out.println("Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }
}