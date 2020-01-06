package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Commonuser;
import com.ShanghaiUniversity.pojo.CommonuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonuserMapper {
    int countByExample(CommonuserExample example);

    int deleteByExample(CommonuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commonuser record);

    int insertSelective(Commonuser record);

    List<Commonuser> selectByExample(CommonuserExample example);

    Commonuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commonuser record, @Param("example") CommonuserExample example);

    int updateByExample(@Param("record") Commonuser record, @Param("example") CommonuserExample example);

    int updateByPrimaryKeySelective(Commonuser record);

    int updateByPrimaryKey(Commonuser record);
}