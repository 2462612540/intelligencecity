package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.AdministratoruserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class AdministratoruserServiceImpl implements AdministratoruserService {

    @Autowired
    private AdministratoruserMapper administratoruserMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Administratoruser> findAll() {
        return administratoruserMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Administratoruser> page = (Page<Administratoruser>) administratoruserMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Administratoruser administratoruser) {
        administratoruserMapper.insert(administratoruser);
    }

    /**
     * 修改
     */
    @Override
    public void update(Administratoruser administratoruser) {
        administratoruserMapper.updateByPrimaryKey(administratoruser);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Administratoruser findOne(int id) {
        return administratoruserMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            administratoruserMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Administratoruser administratoruser, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        AdministratoruserExample example = new AdministratoruserExample();
        AdministratoruserExample.Criteria criteria = example.createCriteria();

        if (administratoruser != null) {
            if (administratoruser.getUserName() != null && administratoruser.getUserName().length() > 0) {
                criteria.andUserNameLike("%" + administratoruser.getUserName() + "%");
            }
            if (administratoruser.getUserPassword() != null && administratoruser.getUserPassword().length() > 0) {
                criteria.andUserPasswordLike("%" + administratoruser.getUserPassword() + "%");
            }
            if (administratoruser.getUserPhone() != null && administratoruser.getUserPhone().length() > 0) {
                criteria.andUserPhoneLike("%" + administratoruser.getUserPhone() + "%");
            }
            if (administratoruser.getOtherMessage() != null && administratoruser.getOtherMessage().length() > 0) {
                criteria.andOtherMessageLike("%" + administratoruser.getOtherMessage() + "%");
            }
        }

        Page<Administratoruser> page = (Page<Administratoruser>) administratoruserMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
