package com.fkxiaozhou.music.moudle.login.service.impl;

import com.fkxiaozhou.music.common.config.Result;
import com.fkxiaozhou.music.common.config.ResultCode;
import com.fkxiaozhou.music.common.ex.CustomException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.music.moudle.login.entity.User;
import com.fkxiaozhou.music.moudle.login.mapper.UserMapper;
import com.fkxiaozhou.music.moudle.login.service.UserService;

import java.rmi.ServerException;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertUser(String username, String password) {
//        boolean i = userMapper.selectByusername(username);
//        if (i) {
            return userMapper.insertUser(username, password);
//        }else{
//            throw new CustomException(ResultCode.FAIL);

//        }
    }

    @Override
    public boolean verifyPassword(String username, String password) {
        return userMapper.verifyPassword(username,password)>0;
    }
}
