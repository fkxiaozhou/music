package com.fkxiaozhou.music.moudle.sing.mapper;

import com.fkxiaozhou.music.moudle.sing.entity.Singer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SingerMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    boolean insert(Singer record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Singer record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Singer selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Singer record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
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