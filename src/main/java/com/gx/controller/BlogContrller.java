package com.gx.controller;

import com.gx.service.BlogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gx on 2016/12/23.
 */
@Controller
@RequestMapping( value = "/blog")
public class BlogContrller {
    private Logger log = Logger.getLogger(BlogContrller.class);
@Autowired
private BlogService blogService;
    @RequestMapping(value = "/do")
    public String Login() {
        return  "edit";
    }

    @RequestMapping(value = "/edit")
    public void logn (@RequestParam( value = "blogTitle")String blogTitle,
                        @RequestParam( value = "blogContent")String blogContent
                         , HttpServletResponse response){
        try {
            if (blogTitle.length()>20 || blogContent.length()>100){
            response.setStatus(404);
        }else {
            blogService.insertBolg(blogTitle,blogContent);
            response.setStatus(200);
        }


        }catch (Exception e){
            e.getMessage();
        }
    }

}
