package org.apache.dao;

import org.apache.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.dao
 * @ClassName: UserDao
 * @Author: xpj
 * @Date: 2021/4/26 下午 3:02
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public interface UserDao {
    User selectByAccount(@Param("account") String account);

    void insertUser(User user);
}
