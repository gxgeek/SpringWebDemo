package com.gx.service;

import com.gx.dao.UserMapping;
import com.gx.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gx on 2016/12/22.
 */
@Service
public class UserService {
    @Resource
    UserMapping userMapping;

    public List<User> userList() {
        return userMapping.selectUserList();
    }
}
