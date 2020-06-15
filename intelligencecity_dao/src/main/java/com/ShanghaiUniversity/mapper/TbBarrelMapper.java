package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbBarrel;
import com.ShanghaiUniversity.pojo.TbBarrelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBarrelMapper {
    int countByExample(TbBarrelExample example);

    int deleteByExample(TbBarrelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBarrel record);

    int insertSelective(TbBarrel record);

    List<TbBarrel> selectByExample(TbBarrelExample example);

    TbBarrel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBarrel record, @Param("example") TbBarrelExample example);

    int updateByExample(@Param("record") TbBarrel record, @Param("example") TbBarrelExample example);

    int updateByPrimaryKeySelective(TbBarrel record);

    int updateByPrimaryKey(TbBarrel record);
}