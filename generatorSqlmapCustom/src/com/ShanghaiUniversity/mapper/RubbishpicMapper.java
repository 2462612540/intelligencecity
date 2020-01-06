package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Rubbishpic;
import com.ShanghaiUniversity.pojo.RubbishpicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RubbishpicMapper {
    int countByExample(RubbishpicExample example);

    int deleteByExample(RubbishpicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rubbishpic record);

    int insertSelective(Rubbishpic record);

    List<Rubbishpic> selectByExample(RubbishpicExample example);

    Rubbishpic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rubbishpic record, @Param("example") RubbishpicExample example);

    int updateByExample(@Param("record") Rubbishpic record, @Param("example") RubbishpicExample example);

    int updateByPrimaryKeySelective(Rubbishpic record);

    int updateByPrimaryKey(Rubbishpic record);
}