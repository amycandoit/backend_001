package com.playdata.game.servlet;

import com.playdata.game.dao.UserDao;
import com.playdata.game.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/signup.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String name = req.getParameter("name");

        if(username.equals("")||password.equals("")||name.equals("")){
            resp.sendRedirect("/signup");
        }else {

            User signup = new User(null, username, password, name, null);
            UserDao userDao = new UserDao();
            userDao.insert(signup);

            resp.sendRedirect("/main");
        }
    }
}

