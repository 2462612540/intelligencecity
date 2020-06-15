package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbRubpictureMapper;
import com.ShanghaiUniversity.pojo.TbRubpicture;
import com.ShanghaiUniversity.pojo.TbRubpictureExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.RubpictureService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class RubpictureServiceImpl implements RubpictureService {

    @Autowired
    private TbRubpictureMapper rubpictureMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbRubpicture> findAll() {
        return rubpictureMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbRubpicture> page = (Page<TbRubpicture>) rubpictureMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbRubpicture rubpicture) {
        rubpictureMapper.insert(rubpicture);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbRubpicture rubpicture) {
        rubpictureMapper.updateByPrimaryKey(rubpicture);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbRubpicture findOne(Long id) {
        return rubpictureMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            rubpictureMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbRubpicture rubpicture, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbRubpictureExample example = new TbRubpictureExample();
        TbRubpictureExample.Criteria criteria = example.createCriteria();

        if (rubpicture != null) {
            if (rubpicture.getAddress() != null && rubpicture.getAddress().length() > 0) {
                criteria.andAddressLike("%" + rubpicture.getAddress() + "%");
            }
            if (rubpicture.getPath() != null && rubpicture.getPath().length() > 0) {
                criteria.andPathLike("%" + rubpicture.getPath() + "%");
            }
            if (rubpicture.getOther() != null && rubpicture.getOther().length() > 0) {
                criteria.andOtherLike("%" + rubpicture.getOther() + "%");
            }

        }

        Page<TbRubpicture> page = (Page<TbRubpicture>) rubpictureMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
