package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Coordinate;
import com.ShanghaiUniversity.pojo.CoordinateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoordinateMapper {
    int countByExample(CoordinateExample example);

    int deleteByExample(CoordinateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coordinate record);

    int insertSelective(Coordinate record);

    List<Coordinate> selectByExample(CoordinateExample example);

    Coordinate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coordinate record, @Param("example") CoordinateExample example);

    int updateByExample(@Param("record") Coordinate record, @Param("example") CoordinateExample example);

    int updateByPrimaryKeySelective(Coordinate record);

    int updateByPrimaryKey(Coordinate record);
}