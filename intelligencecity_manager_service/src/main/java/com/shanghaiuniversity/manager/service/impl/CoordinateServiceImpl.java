package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class CoordinateServiceImpl implements CoordinateService {

    @Autowired
    private CoordinateMapper coordinateMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Coordinate> findAll() {
        return coordinateMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Coordinate> page = (Page<Coordinate>) coordinateMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Coordinate coordinate) {
        coordinateMapper.insert(coordinate);
    }

    /**
     * 修改
     */
    @Override
    public void update(Coordinate coordinate) {
        coordinateMapper.updateByPrimaryKey(coordinate);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Coordinate findOne(int id) {
        return coordinateMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            coordinateMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Coordinate coordinate, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        CoordinateExample example = new CoordinateExample();
        CoordinateExample.Criteria criteria = example.createCriteria();

        if (coordinate != null) {
            if (coordinate.getPicture() != null && coordinate.getPicture().length() > 0) {
                criteria.andPictureLike("%" + coordinate.getPicture() + "%");
            }
            if (coordinate.getOther() != null && coordinate.getOther().length() > 0) {
                criteria.andOtherLike("%" + coordinate.getOther() + "%");
            }

        }

        Page<Coordinate> page = (Page<Coordinate>) coordinateMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
