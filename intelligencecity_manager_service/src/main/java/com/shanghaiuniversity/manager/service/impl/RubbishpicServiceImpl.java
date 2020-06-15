package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.RubbishpicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class RubbishpicServiceImpl implements RubbishpicService {

    @Autowired
    private RubbishpicMapper rubbishpicMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Rubbishpic> findAll() {
        return rubbishpicMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Rubbishpic> page = (Page<Rubbishpic>) rubbishpicMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Rubbishpic rubbishpic) {
        rubbishpicMapper.insert(rubbishpic);
    }

    /**
     * 修改
     */
    @Override
    public void update(Rubbishpic rubbishpic) {
        rubbishpicMapper.updateByPrimaryKey(rubbishpic);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Rubbishpic findOne(int id) {
        return rubbishpicMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            rubbishpicMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Rubbishpic rubbishpic, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        RubbishpicExample example = new RubbishpicExample();
        RubbishpicExample.Criteria criteria = example.createCriteria();

        if (rubbishpic != null) {
            if (rubbishpic.getRubbishPath() != null && rubbishpic.getRubbishPath().length() > 0) {
                criteria.andRubbishPathLike("%" + rubbishpic.getRubbishPath() + "%");
            }
            if (rubbishpic.getRubbishLocation() != null && rubbishpic.getRubbishLocation().length() > 0) {
                criteria.andRubbishLocationLike("%" + rubbishpic.getRubbishLocation() + "%");
            }
        }
        Page<Rubbishpic> page = (Page<Rubbishpic>) rubbishpicMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
