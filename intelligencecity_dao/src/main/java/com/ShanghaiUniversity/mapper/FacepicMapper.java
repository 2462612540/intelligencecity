package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.Facepic;
import com.ShanghaiUniversity.pojo.FacepicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FacepicMapper {
    int countByExample(FacepicExample example);

    int deleteByExample(FacepicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Facepic record);

    int insertSelective(Facepic record);

    List<Facepic> selectByExample(FacepicExample example);

    Facepic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Facepic record, @Param("example") FacepicExample example);

    int updateByExample(@Param("record") Facepic record, @Param("example") FacepicExample example);

    int updateByPrimaryKeySelective(Facepic record);

    int updateByPrimaryKey(Facepic record);
}