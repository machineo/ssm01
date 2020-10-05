package cn.mm.controller;

import cn.mm.pojo.User;
import cn.mm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController{
    @Autowired
    private UserService userService = null;

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("index");
        System.out.println("username: " + request.getParameter("username"));
        System.out.println("password: " + request.getParameter("password"));

//        mav.addObject("message",)
        User user_ = userService.login("zhnagsan");
        mav.addObject("user", user_);
        return mav;
    }

    @RequestMapping("/testpojo")
    public String testPojo(User user){
        System.out.println("请求参数直接封装成了： " + user);
        return "testpojo";
    }
}
