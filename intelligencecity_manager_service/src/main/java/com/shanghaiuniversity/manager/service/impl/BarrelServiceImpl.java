package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.BarrelMapper;
import com.ShanghaiUniversity.pojo.Barrel;
import com.ShanghaiUniversity.pojo.BarrelExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.BarrelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 * 切记一定是调用的是阿里巴巴的这个service的包 import com.alibaba.dubbo.properties.annotation.Service; 不能是spring的包，否这是不能实现分布式的调用的
 */
@Service
public class BarrelServiceImpl implements BarrelService {

    @Autowired
    private BarrelMapper barrelMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Barrel> findAll() {
        return barrelMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Barrel> page = (Page<Barrel>) barrelMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Barrel barrel) {
        barrelMapper.insert(barrel);
    }

    /**
     * 修改
     */
    @Override
    public void update(Barrel barrel) {
        barrelMapper.updateByPrimaryKey(barrel);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Barrel findOne(int id) {
        return barrelMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            barrelMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Barrel barrel, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        BarrelExample example = new BarrelExample();
        BarrelExample.Criteria criteria = example.createCriteria();

        if (barrel != null) {
            if (barrel.getLocation() != null && barrel.getLocation().length() > 0) {
                criteria.andLocationLike("%" + barrel.getLocation() + "%");
            }

        }

        Page<Barrel> page = (Page<Barrel>) barrelMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
