package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbCoordinateMapper;
import com.ShanghaiUniversity.pojo.TbCoordinate;
import com.ShanghaiUniversity.pojo.TbCoordinateExample;
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
    private TbCoordinateMapper coordinateMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbCoordinate> findAll() {
        return coordinateMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbCoordinate> page = (Page<TbCoordinate>) coordinateMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbCoordinate coordinate) {
        coordinateMapper.insert(coordinate);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbCoordinate coordinate) {
        coordinateMapper.updateByPrimaryKey(coordinate);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbCoordinate findOne(Long id) {
        return coordinateMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            coordinateMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbCoordinate coordinate, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbCoordinateExample example = new TbCoordinateExample();
        TbCoordinateExample.Criteria criteria = example.createCriteria();

        if (coordinate != null) {
            if (coordinate.getAddress() != null && coordinate.getAddress().length() > 0) {
                criteria.andAddressLike("%" + coordinate.getAddress() + "%");
            }
            if (coordinate.getPicture() != null && coordinate.getPicture().length() > 0) {
                criteria.andPictureLike("%" + coordinate.getPicture() + "%");
            }
            if (coordinate.getOthher() != null && coordinate.getOthher().length() > 0) {
                criteria.andOthherLike("%" + coordinate.getOthher() + "%");
            }

        }

        Page<TbCoordinate> page = (Page<TbCoordinate>) coordinateMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
