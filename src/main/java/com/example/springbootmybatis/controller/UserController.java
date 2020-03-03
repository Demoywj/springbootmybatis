package com.example.springbootmybatis.controller;
import com.example.springbootmybatis.model.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/add")
    public int addUser(User user){
        return userService.addUser(user);
    }
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }



    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "1")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
