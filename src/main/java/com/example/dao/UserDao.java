package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.dao
 * @ClassName: UserDao
 * @Author: xpj
 * @Date: 2021/5/8 下午 3:21
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public interface UserDao {
    User selectByAccount(@Param("account") String account);

}
