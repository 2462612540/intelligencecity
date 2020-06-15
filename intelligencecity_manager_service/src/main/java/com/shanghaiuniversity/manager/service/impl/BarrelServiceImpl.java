package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbBarrelMapper;
import com.ShanghaiUniversity.pojo.TbBarrel;
import com.ShanghaiUniversity.pojo.TbBarrelExample;
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
 */
@Service
public class BarrelServiceImpl implements BarrelService {

    @Autowired
    private TbBarrelMapper barrelMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbBarrel> findAll() {
        return barrelMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBarrel> page = (Page<TbBarrel>) barrelMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbBarrel barrel) {
        barrelMapper.insert(barrel);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbBarrel barrel) {
        barrelMapper.updateByPrimaryKey(barrel);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbBarrel findOne(Long id) {
        return barrelMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            barrelMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBarrel barrel, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbBarrelExample example = new TbBarrelExample();
        TbBarrelExample.Criteria criteria = example.createCriteria();

        if (barrel != null) {
            if (barrel.getAddress() != null && barrel.getAddress().length() > 0) {
                criteria.andAddressLike("%" + barrel.getAddress() + "%");
            }
            if (barrel.getCompany() != null && barrel.getCompany().length() > 0) {
                criteria.andCompanyLike("%" + barrel.getCompany() + "%");
            }
            if (barrel.getStatus() != null && barrel.getStatus().length() > 0) {
                criteria.andStatusLike("%" + barrel.getStatus() + "%");
            }
            if (barrel.getOther() != null && barrel.getOther().length() > 0) {
                criteria.andOtherLike("%" + barrel.getOther() + "%");
            }
        }
        Page<TbBarrel> page = (Page<TbBarrel>) barrelMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
