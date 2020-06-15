package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbWeight;
import com.ShanghaiUniversity.pojo.TbWeightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbWeightMapper {
    int countByExample(TbWeightExample example);

    int deleteByExample(TbWeightExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbWeight record);

    int insertSelective(TbWeight record);

    List<TbWeight> selectByExample(TbWeightExample example);

    TbWeight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbWeight record, @Param("example") TbWeightExample example);

    int updateByExample(@Param("record") TbWeight record, @Param("example") TbWeightExample example);

    int updateByPrimaryKeySelective(TbWeight record);

    int updateByPrimaryKey(TbWeight record);
}