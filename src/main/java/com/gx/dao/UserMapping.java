package com.gx.dao;

import com.gx.model.User;

import java.util.List;

/**
 * Created by gx on 2016/12/22.
 */
public interface UserMapping {
    List<User> selectUserList();
}
