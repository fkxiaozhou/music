package com.fkxiaozhou.music.moudle.login.service;

import com.fkxiaozhou.music.moudle.login.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 添加用户（注册）
     * @param username
     * @param password
     * @return
     */
    int insertUser(java.lang.String username, String password);

    /**
     * 登录，验证密码
     * @param username
     * @param password
     * @return
     */
    boolean verifyPassword(String username, String password);
}
