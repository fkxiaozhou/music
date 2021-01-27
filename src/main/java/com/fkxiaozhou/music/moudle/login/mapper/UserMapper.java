package com.fkxiaozhou.music.moudle.login.mapper;

import com.fkxiaozhou.music.moudle.login.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);

    /**
     * 查询用户是否存在
     *
     * @param username
     * @return
     */
    boolean selectByusername(@Param("username") String username);

    /**
     * 添加用户(注册)
     *
     * @param username
     * @param password
     * @return
     */
    int insertUser(@Param("username") String username, @Param("password") String password);

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    int verifyPassword(@Param("username") String username, @Param("password") String password);

}