package com.playdata.user.controller;

import com.playdata.user.domain.dto.User;
import com.playdata.user.domain.request.LoginRequest;
import com.playdata.user.domain.request.SignupRequest;
import com.playdata.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/login")
    public String getLoginPage() {
        return "user/login";
    }

    @PostMapping("/user/login")
    public ModelAndView postLogin(@ModelAttribute LoginRequest request
            , ModelAndView mav
            , HttpSession session) {
        User login = userService.login(request);
        if (login != null) {
            session.setAttribute("id", login.getId());
            session.setAttribute("name", login.getName());
            mav.setViewName("redirect:/main");
        } else {
            mav.setViewName("redirect:/user/login");
        }
        return mav;
    }

    @GetMapping("/user/signup")
    public String getSignupPage() {
        return "user/signup";
    }

    @PostMapping("/user/signup")
    public ModelAndView postSignup(
            @ModelAttribute SignupRequest request
            ,ModelAndView mav) {
        if (userService.signup(request)) {
            mav.setViewName("redirect:/user/login");
        } else {
            mav.setViewName("redirect:/user/signup");
        }
        return mav;
    }
    @GetMapping("/main")
    public String getMainPage() {
        return "/main";
    }
    @PostMapping("/main")
    public String postMainPage() {
        return "/main";
    }
}
