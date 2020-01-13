package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.FacepicMapper;
import com.ShanghaiUniversity.pojo.Facepic;
import com.ShanghaiUniversity.pojo.FacepicExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.FacepicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class FacepicServiceImpl implements FacepicService {

    @Autowired
    private FacepicMapper facepicMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Facepic> findAll() {
        return facepicMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Facepic> page = (Page<Facepic>) facepicMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Facepic facepic) {
        facepicMapper.insert(facepic);
    }

    /**
     * 修改
     */
    @Override
    public void update(Facepic facepic) {
        facepicMapper.updateByPrimaryKey(facepic);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Facepic findOne(int id) {
        return facepicMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            facepicMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Facepic facepic, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        FacepicExample example = new FacepicExample();
        FacepicExample.Criteria criteria = example.createCriteria();

        if (facepic != null) {
            if (facepic.getFacePath() != null && facepic.getFacePath().length() > 0) {
                criteria.andFacePathLike("%" + facepic.getFacePath() + "%");
            }
            if (facepic.getFaceLocation() != null && facepic.getFaceLocation().length() > 0) {
                criteria.andFaceLocationLike("%" + facepic.getFaceLocation() + "%");
            }
        }
        Page<Facepic> page = (Page<Facepic>) facepicMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
