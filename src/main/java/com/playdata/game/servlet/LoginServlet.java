package com.playdata.game.servlet;

import com.playdata.game.dao.UserDao;
import com.playdata.game.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new UserDao().login(username, password);

        HttpSession session = req.getSession();
        System.out.println(user.getId());
        req.setAttribute("id", user.getId());
        session.setAttribute("uname", user.getName());
        session.setAttribute("id", user.getId());

        if (user != null) {
            resp.sendRedirect("/logout");
        }else {
            resp.sendRedirect("/signup");
        }
    }
}
