package com.gx.dao;

import com.gx.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gx on 2016/12/15.
 */

public interface AccountMapper {
    int updaTetransfermoneyBySourceId(@Param(value = "count") double count, @Param(value = "id") long id);

    int updaTetransfermoneyByTargetId(@Param(value = "count") double count, @Param(value = "id") long id);
    List<Account> selectAll();
}
