package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbNotificationMapper;
import com.ShanghaiUniversity.pojo.TbNotification;
import com.ShanghaiUniversity.pojo.TbNotificationExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private TbNotificationMapper notificationMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbNotification> findAll() {
        return notificationMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbNotification> page = (Page<TbNotification>) notificationMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbNotification notification) {
        notificationMapper.insert(notification);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbNotification notification) {
        notificationMapper.updateByPrimaryKey(notification);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbNotification findOne(Long id) {
        return notificationMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            notificationMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbNotification notification, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbNotificationExample example = new TbNotificationExample();
        TbNotificationExample.Criteria criteria = example.createCriteria();

        if (notification != null) {
            if (notification.getContent() != null && notification.getContent().length() > 0) {
                criteria.andContentLike("%" + notification.getContent() + "%");
            }
            if (notification.getOther() != null && notification.getOther().length() > 0) {
                criteria.andOtherLike("%" + notification.getOther() + "%");
            }
            if (notification.getUsername() != null && notification.getUsername().length() > 0) {
                criteria.andUsernameLike("%" + notification.getUsername() + "%");
            }

        }

        Page<TbNotification> page = (Page<TbNotification>) notificationMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
