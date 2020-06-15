package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbMinitorerMapper;
import com.ShanghaiUniversity.pojo.TbMinitorer;
import com.ShanghaiUniversity.pojo.TbMinitorerExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.MinitorerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class MinitorerServiceImpl implements MinitorerService {

    @Autowired
    private TbMinitorerMapper minitorerMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbMinitorer> findAll() {
        return minitorerMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbMinitorer> page = (Page<TbMinitorer>) minitorerMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbMinitorer minitorer) {
        minitorerMapper.insert(minitorer);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbMinitorer minitorer) {
        minitorerMapper.updateByPrimaryKey(minitorer);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbMinitorer findOne(Long id) {
        return minitorerMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            minitorerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbMinitorer minitorer, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbMinitorerExample example = new TbMinitorerExample();
        TbMinitorerExample.Criteria criteria = example.createCriteria();

        if (minitorer != null) {
            if (minitorer.getAccount() != null && minitorer.getAccount().length() > 0) {
                criteria.andAccountLike("%" + minitorer.getAccount() + "%");
            }
            if (minitorer.getUsername() != null && minitorer.getUsername().length() > 0) {
                criteria.andUsernameLike("%" + minitorer.getUsername() + "%");
            }
            if (minitorer.getPassword() != null && minitorer.getPassword().length() > 0) {
                criteria.andPasswordLike("%" + minitorer.getPassword() + "%");
            }
            if (minitorer.getPhone() != null && minitorer.getPhone().length() > 0) {
                criteria.andPhoneLike("%" + minitorer.getPhone() + "%");
            }
            if (minitorer.getEmail() != null && minitorer.getEmail().length() > 0) {
                criteria.andEmailLike("%" + minitorer.getEmail() + "%");
            }
            if (minitorer.getStatus() != null && minitorer.getStatus().length() > 0) {
                criteria.andStatusLike("%" + minitorer.getStatus() + "%");
            }
            if (minitorer.getSex() != null && minitorer.getSex().length() > 0) {
                criteria.andSexLike("%" + minitorer.getSex() + "%");
            }
            if (minitorer.getAddress() != null && minitorer.getAddress().length() > 0) {
                criteria.andAddressLike("%" + minitorer.getAddress() + "%");
            }
            if (minitorer.getOther() != null && minitorer.getOther().length() > 0) {
                criteria.andOtherLike("%" + minitorer.getOther() + "%");
            }

        }

        Page<TbMinitorer> page = (Page<TbMinitorer>) minitorerMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
