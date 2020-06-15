package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbRubpicture;
import com.ShanghaiUniversity.pojo.TbRubpictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRubpictureMapper {
    int countByExample(TbRubpictureExample example);

    int deleteByExample(TbRubpictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRubpicture record);

    int insertSelective(TbRubpicture record);

    List<TbRubpicture> selectByExample(TbRubpictureExample example);

    TbRubpicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRubpicture record, @Param("example") TbRubpictureExample example);

    int updateByExample(@Param("record") TbRubpicture record, @Param("example") TbRubpictureExample example);

    int updateByPrimaryKeySelective(TbRubpicture record);

    int updateByPrimaryKey(TbRubpicture record);
}