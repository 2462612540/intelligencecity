package com.shanghaiuniversity.user.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.CommonuserMapper;
import com.ShanghaiUniversity.pojo.Commonuser;
import com.ShanghaiUniversity.pojo.CommonuserExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.user.service.CommonuserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class CommonuserServiceImpl implements CommonuserService {

    @Autowired
    private CommonuserMapper commonuserMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Commonuser> findAll() {
        return commonuserMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Commonuser> page = (Page<Commonuser>) commonuserMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Commonuser commonuser) {
        commonuserMapper.insert(commonuser);
    }

    /**
     * 修改
     */
    @Override
    public void update(Commonuser commonuser) {
        commonuserMapper.updateByPrimaryKey(commonuser);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Commonuser findOne(int id) {
        return commonuserMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            commonuserMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Commonuser commonuser, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        CommonuserExample example = new CommonuserExample();
        CommonuserExample.Criteria criteria = example.createCriteria();

        if (commonuser != null) {
            if (commonuser.getUserName() != null && commonuser.getUserName().length() > 0) {
                criteria.andUserNameLike("%" + commonuser.getUserName() + "%");
            }
            if (commonuser.getUserPassword() != null && commonuser.getUserPassword().length() > 0) {
                criteria.andUserPasswordLike("%" + commonuser.getUserPassword() + "%");
            }
            if (commonuser.getUserPhone() != null && commonuser.getUserPhone().length() > 0) {
                criteria.andUserPhoneLike("%" + commonuser.getUserPhone() + "%");
            }
            if (commonuser.getOtherMessage() != null && commonuser.getOtherMessage().length() > 0) {
                criteria.andOtherMessageLike("%" + commonuser.getOtherMessage() + "%");
            }
        }

        Page<Commonuser> page = (Page<Commonuser>) commonuserMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
