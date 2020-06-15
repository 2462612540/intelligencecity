package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbMinitorer;
import com.ShanghaiUniversity.pojo.TbMinitorerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMinitorerMapper {
    int countByExample(TbMinitorerExample example);

    int deleteByExample(TbMinitorerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMinitorer record);

    int insertSelective(TbMinitorer record);

    List<TbMinitorer> selectByExample(TbMinitorerExample example);

    TbMinitorer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMinitorer record, @Param("example") TbMinitorerExample example);

    int updateByExample(@Param("record") TbMinitorer record, @Param("example") TbMinitorerExample example);

    int updateByPrimaryKeySelective(TbMinitorer record);

    int updateByPrimaryKey(TbMinitorer record);
}