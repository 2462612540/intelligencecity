package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbWeightMapper;
import com.ShanghaiUniversity.pojo.TbWeight;
import com.ShanghaiUniversity.pojo.TbWeightExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class WeightServiceImpl implements WeightService {

    @Autowired
    private TbWeightMapper weightMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbWeight> findAll() {
        return weightMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbWeight> page = (Page<TbWeight>) weightMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbWeight weight) {
        weightMapper.insert(weight);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbWeight weight) {
        weightMapper.updateByPrimaryKey(weight);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbWeight findOne(Long id) {
        return weightMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            weightMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbWeight weight, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbWeightExample example = new TbWeightExample();
        TbWeightExample.Criteria criteria = example.createCriteria();
        if (weight != null) {
        }
        Page<TbWeight> page = (Page<TbWeight>) weightMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
