package com.gx.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by gx on 2016/12/23.
 */
public interface BlogMapping {


    int insertBlog(@Param(value = "blogTitle")String blogTitle,@Param(value = "blogContent")String blogContent);
}
