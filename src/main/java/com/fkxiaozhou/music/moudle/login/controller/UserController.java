package com.fkxiaozhou.music.moudle.login.controller;

import com.fkxiaozhou.music.common.config.Result;
import com.alibaba.fastjson.JSONObject;
import com.fkxiaozhou.music.moudle.login.service.UserService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("music")
@Api(value = "用户登录",tags = "用户登录")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public Result register(String username,String password){
        userService.insertUser(username, password);
        return Result.SUCCESS("完成注册");
    }

    @GetMapping
    public Result login(String username, String password, HttpServletRequest request){
        request.getParameter("username");
        request.getParameter("password");
        boolean b = userService.verifyPassword(username, password);
        if (b){
            return Result.SUCCESS("登录成功");
        }
        return Result.FAIL("登录失败");
    }
}
