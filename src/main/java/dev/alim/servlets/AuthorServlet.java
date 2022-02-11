package dev.alim.servlets;

import dev.alim.models.EventType;
import dev.alim.models.Reimbursement;
import dev.alim.models.User;
import dev.alim.service.ReimbursementService;
import dev.alim.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;

public class AuthorServlet extends HttpServlet {
    ReimbursementService rs = new ReimbursementService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello world");
        HttpSession session = req.getSession(false);
        if (session == null) {
            PrintWriter out = resp.getWriter();
            out.write("<h2>To submit the Reimbursement required to be login first</h2>");
            out.write("<a href='login.html'>Login</a>");
            System.out.println("session is null");
        } else {
            // otherwise read details from the form data
            EventType eventType = EventType.valueOf(req.getParameter("EventType"));
            String eventLocation = req.getParameter("EventLocation");
            Date eventDate = Date.valueOf(req.getParameter("date"));
            String grade = req.getParameter("Grade");
            Double eventCost = Double.valueOf(req.getParameter("Cost"));
            String description = req.getParameter("description");


            // Now we can get the user from the session
            User u = (User) session.getAttribute("user");
            Reimbursement pr = new Reimbursement();
            pr.setAuthor(u);
            pr.setEventType(eventType);
            pr.setEventLocation(eventLocation);
            pr.setEventDate(eventDate);
            pr.setGrade(grade);
            pr.setEventCost(eventCost);
            pr.setDescription(description);

            System.out.println(pr.toString());
            System.out.println(u.toString());
            rs.addReimbursement(pr);
            resp.sendRedirect("index.html");
        }

    }

}
