package com.ShanghaiUniversity.mapper;

import com.ShanghaiUniversity.pojo.TbNotification;
import com.ShanghaiUniversity.pojo.TbNotificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbNotificationMapper {
    int countByExample(TbNotificationExample example);

    int deleteByExample(TbNotificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbNotification record);

    int insertSelective(TbNotification record);

    List<TbNotification> selectByExample(TbNotificationExample example);

    TbNotification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByExample(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByPrimaryKeySelective(TbNotification record);

    int updateByPrimaryKey(TbNotification record);
}