package com.shanghaiuniversity.user.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.UserMapper;
import com.ShanghaiUniversity.pojo.User;
import com.ShanghaiUniversity.pojo.UserExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询全部
     */
    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> page = (Page<User>) userMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    /**
     * 修改
     */
    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public User findOne(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(String[] ids) {
        for (String id : ids) {
            userMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(User user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        if (user != null) {
            if (user.getUserAccount() != null && user.getUserAccount().length() > 0) {
                criteria.andUserAccountLike("%" + user.getUserAccount() + "%");
            }
            if (user.getUserPassword() != null && user.getUserPassword().length() > 0) {
                criteria.andUserPasswordLike("%" + user.getUserPassword() + "%");
            }
            if (user.getUserPhone() != null && user.getUserPhone().length() > 0) {
                criteria.andUserPhoneLike("%" + user.getUserPhone() + "%");
            }
            if (user.getUserMessage() != null && user.getUserMessage().length() > 0) {
                criteria.andUserMessageLike("%" + user.getUserMessage() + "%");
            }
            if (user.getUserName() != null && user.getUserName().length() > 0) {
                criteria.andUserNameLike("%" + user.getUserName() + "%");
            }
        }
        Page<User> page = (Page<User>) userMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
