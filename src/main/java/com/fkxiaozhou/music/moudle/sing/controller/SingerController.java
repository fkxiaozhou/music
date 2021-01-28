package com.fkxiaozhou.music.moudle.sing.controller;

import com.fkxiaozhou.music.common.config.Result;
import com.fkxiaozhou.music.moudle.sing.entity.Singer;
import com.fkxiaozhou.music.moudle.sing.service.SingerService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("music")
@Api(value = "歌手信息",tags = "歌手信息")
@AllArgsConstructor
public class SingerController {
    @Resource
    private SingerService singerService;

    @GetMapping("addsinger")
    public Result addSinger(Singer record,HttpServletRequest request){
        request.getParameter("name");
        request.getParameter("sex");
        request.getParameter("pic");
        request.getParameter("birth");
        request.getParameter("location");
        request.getParameter("introduction");
        boolean insert = singerService.insert(record);
        if (insert){
            return Result.SUCCESS("添加成功");
        }
        return Result.FAIL("添加失败");
    }

    /**
     * 查询所有歌手
     */
    @GetMapping( "/allSinger")
    public Object allSinger(HttpServletRequest request){
        return singerService.allsinger();
    }

    /**
     * 根据姓名模糊查询所有的歌手
     */
    @GetMapping(value = "/singerOfName")
    public Object singerOfName(String name,HttpServletRequest request){
        request.getParameter("name");
        return singerService.singerOfName("%"+name+"%");
    }

    /**
     * 根据性别查询所有歌手
     */
    @GetMapping(value = "/singerOfSex")
    public Object singerOfSex(String sex,HttpServletRequest request){
        request.getParameter("sex");
        return singerService.singerOfSex(Integer.parseInt(sex));
    }
}
