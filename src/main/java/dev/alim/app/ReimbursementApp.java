package dev.alim.app;

import dev.alim.models.User;
import dev.alim.repository.ReimbursementDAO;
import dev.alim.service.UserService;

import java.util.Scanner;

public class ReimbursementApp {
    private static Scanner scanner = new Scanner(System.in);
    private static UserService userService = new UserService();
    private static ReimbursementDAO authorDAO = new ReimbursementDAO();

    public static void main(String[]args){

        User u  = userService.login("alim1", "pass1");
        System.out.println(u);
    }
}

//        int input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                scanner.nextLine();
//                String username = scanner.nextLine();
//                String password = scanner.nextLine();
//                boolean successfulLogin = userService.login(username, password);
//                System.out.println(successfulLogin);
//        }
//
//        User u  = new  userService.login(username,password);
//        System.out.println(u);
//    }
