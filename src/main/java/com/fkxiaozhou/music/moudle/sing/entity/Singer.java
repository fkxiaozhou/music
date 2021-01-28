package com.fkxiaozhou.music.moudle.sing.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 歌手
    */
@ApiModel(value="com-fkxiaozhou-music-moudle-sing-entity-Singer")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Singer implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 姓名
    */
    @ApiModelProperty(value="姓名")
    private String name;

    /**
    * 性别（0女1男2组合3不明）
    */
    @ApiModelProperty(value="性别（0女1男2组合3不明）")
    private Byte sex;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String pic;

    /**
    * 生日
    */
    @ApiModelProperty(value="生日")
    private Date birth;

    /**
    * 地区
    */
    @ApiModelProperty(value="地区")
    private String location;

    /**
    * 简介
    */
    @ApiModelProperty(value="简介")
    private String introduction;

    private static final long serialVersionUID = 1L;
}