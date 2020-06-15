package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbCoordinate;
import com.ShanghaiUniversity.pojo.TbCoordinateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCoordinateMapper {
    int countByExample(TbCoordinateExample example);

    int deleteByExample(TbCoordinateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCoordinate record);

    int insertSelective(TbCoordinate record);

    List<TbCoordinate> selectByExample(TbCoordinateExample example);

    TbCoordinate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCoordinate record, @Param("example") TbCoordinateExample example);

    int updateByExample(@Param("record") TbCoordinate record, @Param("example") TbCoordinateExample example);

    int updateByPrimaryKeySelective(TbCoordinate record);

    int updateByPrimaryKey(TbCoordinate record);
}