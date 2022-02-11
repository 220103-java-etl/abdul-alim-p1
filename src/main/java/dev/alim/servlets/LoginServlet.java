package dev.alim.servlets;

import dev.alim.models.Role;
import dev.alim.models.User;
import dev.alim.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the parameters of username and password from the request.
        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        System.out.println("servlet " + username);
//        System.out.println("servlet " + password);

        User u = userService.login(username, password);
        if (u != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user",u);
            if (u.getRole().equals(Role.EMPLOYEE)){
              resp.sendRedirect("reimbursement.html");
            }else{
                resp.sendRedirect("resolver.html");
            }
//            set up the session here
//            resp.getWriter().write("Successfully logged in");
//            resp.sendRedirect("reimbursement.html");
        } else {
            //resp.setStatus(401);
            resp.sendRedirect("login.html");
        }
    }

}
