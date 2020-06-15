package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbAdminister;
import com.ShanghaiUniversity.pojo.TbAdministerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAdministerMapper {
    int countByExample(TbAdministerExample example);

    int deleteByExample(TbAdministerExample example);

    int deleteByPrimaryKey(String account);

    int insert(TbAdminister record);

    int insertSelective(TbAdminister record);

    List<TbAdminister> selectByExample(TbAdministerExample example);

    TbAdminister selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") TbAdminister record, @Param("example") TbAdministerExample example);

    int updateByExample(@Param("record") TbAdminister record, @Param("example") TbAdministerExample example);

    int updateByPrimaryKeySelective(TbAdminister record);

    int updateByPrimaryKey(TbAdminister record);
}