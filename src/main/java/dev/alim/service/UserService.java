package dev.alim.service;

import dev.alim.models.User;
import dev.alim.repository.UserDAO;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        // first we need the help of our UserDAO to retrieve user information by their username
        User u = userDAO.getByUsername(username);

        // check if user exists
        if (u != null) {
            System.out.println(u.getUsername());
            System.out.println(u.getPassword());
            // check to make sure credentials match
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return u;
            }
        }
        System.out.println("Credentials do not match"); // this would be a great place to use a custom exception
        return null;
    }


}
