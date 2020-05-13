package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Administratoruser;
import com.ShanghaiUniversity.pojo.AdministratoruserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratoruserMapper {
    int countByExample(AdministratoruserExample example);

    int deleteByExample(AdministratoruserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Administratoruser record);

    int insertSelective(Administratoruser record);

    List<Administratoruser> selectByExample(AdministratoruserExample example);

    Administratoruser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Administratoruser record, @Param("example") AdministratoruserExample example);

    int updateByExample(@Param("record") Administratoruser record, @Param("example") AdministratoruserExample example);

    int updateByPrimaryKeySelective(Administratoruser record);

    int updateByPrimaryKey(Administratoruser record);
}