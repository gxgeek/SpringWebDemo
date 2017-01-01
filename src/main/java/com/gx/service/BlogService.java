package com.gx.service;

import com.gx.dao.BlogMapping;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * Created by gx on 2016/12/23.
 */

@Service
public class BlogService {

    @Autowired
    private BlogMapping blogMapping;


    public void insertBolg(String blogTitle,String blogContent )throws  Exception{
        blogMapping.insertBlog(blogTitle,blogContent);
    }

}
