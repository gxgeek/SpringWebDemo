package com.gx.controller;

import com.alibaba.fastjson.JSON;
import com.gx.model.User;
import com.gx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gx on 2016/12/22.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    UserService userService;


    @RequestMapping(value = "userList")
    public ModelAndView userList() {
            List<User> list =userService.userList();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("user");
            modelAndView.addObject("userList",list);
            return  modelAndView;
    }
}
