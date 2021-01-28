package com.fkxiaozhou.music.moudle.sing.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fkxiaozhou.music.moudle.sing.entity.Singer;
import com.fkxiaozhou.music.moudle.sing.mapper.SingerMapper;
import com.fkxiaozhou.music.moudle.sing.service.SingerService;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService{

    @Resource
    private SingerMapper singerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return singerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Singer record) {
        return singerMapper.insert(record);
    }

    @Override
    public int insertSelective(Singer record) {
        return singerMapper.insertSelective(record);
    }

    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Singer record) {
        return singerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Singer record) {
        return singerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Singer> allsinger() {
        return singerMapper.allsinger();
    }

    @Override
    public List<Singer> singerOfName(String name) {
        return singerMapper.singerOfName(name);
    }

    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerMapper.singerOfSex(sex);
    }

}
