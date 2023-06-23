package com.naver.user.controller;

import com.naver.user.dto.User;
import com.naver.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @이 문법 = 어노테이션 (PSA Portable Service Abstraction)
// 어떤 기술을 내부에 숨기고 개발자들에게 편의성 제공하는 추상화 기법
@Controller
@RequestMapping(value = "/user")
public class UserController {
    //    @RequestMapping(method = RequestMethod.GET, value = "/test") //servlet doget과 똑같다
    List<User> users = new ArrayList<>(); //static 붙은 이유 1개로 계속 쓰기 위해
    //static이 가장 많이 쓰이는곳 , 싱글톤 ,spring은 자동적으로 싱글톤을 만들어줘서 static이 따로 필요없나 ?
//    @Autowired
    private final UserService userService;
//    public UserController(UserService userService) {
//        this.userService =userService;
//    }
    private final ApplicationContext applicationContext;
    private final int getCount;



    public UserController(UserService userService, ApplicationContext applicationContext, int getCount) {
        this.userService = userService;
        this.applicationContext = applicationContext;
        this.getCount = getCount;

    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    //    @RequestMapping(method = RequestMethod.GET, value = "/test2")
    @GetMapping("/test2")
    public String test2(Model model) {

//        new UserService().test();
        System.out.println(userService.test());
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String s:beanDefinitionNames) {
//            System.out.println(s);
//        }
        System.out.println(getCount);
        model.addAttribute("serverTime", LocalDateTime.now().toString());
        System.out.println(users);
        if(users.size()>0)users.get(0).setId("park");
        return "/index";
    }

    @PostMapping("/test2")
    public String insetUser(HttpServletRequest req) throws UnsupportedEncodingException {
        String id = req.getParameter("id"); // index.jsp내의 input name id에서 id 받아오기
        String pw = req.getParameter("pw"); //index.jsp내의 input name pw에서 pw 받아오기
            req.setCharacterEncoding("UTF-8"); //한글나오게 하는거
//        Map<String, String> map = new HashMap<>(); //map 변수를 만들어서
//        map.put("id",id); //map 변수에 id 넣고
//        map.put("pw",pw); //map 변수에 pw 넣고
        User user = new User(id,pw); //User의 id와 pw를 user가 참조
//        user.setId(id);
//        user.setPw(pw);
        users.add(user); //map에 담긴 id pw정보를 다시 List users에 넣는다
        return "redirect:/user/test2";
    }
}
