package com.fkxiaozhou.music.moudle.sing.service;

import com.fkxiaozhou.music.moudle.sing.entity.Singer;

import java.util.List;

public interface SingerService{


    int deleteByPrimaryKey(Integer id);

    boolean insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    /**
     * 查询所有的歌手
     * @return
     */
    List<Singer> allsinger();

    /**
     * 根据用户名模糊查询歌手
     * @param name
     * @return
     */
    List<Singer> singerOfName(String name);

    /**
     * 根据性别查询歌手
     * @param sex
     * @return
     */
    List<Singer> singerOfSex(Integer sex);
}
