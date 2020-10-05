package cn.mm.controller;

import cn.mm.pojo.User;
import cn.mm.service.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class DemoController {
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
