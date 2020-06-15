package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbAdministerMapper;
import com.ShanghaiUniversity.pojo.TbAdminister;
import com.ShanghaiUniversity.pojo.TbAdministerExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.AdministerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class AdministerServiceImpl implements AdministerService {

    @Autowired
    private TbAdministerMapper administerMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbAdminister> findAll() {
        return administerMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbAdminister> page = (Page<TbAdminister>) administerMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbAdminister administer) {
        administerMapper.insert(administer);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbAdminister administer) {
        administerMapper.updateByPrimaryKey(administer);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbAdminister findOne(Long id) {
        return administerMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            administerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbAdminister administer, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbAdministerExample example = new TbAdministerExample();
        TbAdministerExample.Criteria criteria = example.createCriteria();
        if (administer != null) {
            if (administer.getAccount() != null && administer.getAccount().length() > 0) {
                criteria.andAccountLike("%" + administer.getAccount() + "%");
            }
            if (administer.getUsername() != null && administer.getUsername().length() > 0) {
                criteria.andUsernameLike("%" + administer.getUsername() + "%");
            }
            if (administer.getPassword() != null && administer.getPassword().length() > 0) {
                criteria.andPasswordLike("%" + administer.getPassword() + "%");
            }
            if (administer.getPhone() != null && administer.getPhone().length() > 0) {
                criteria.andPhoneLike("%" + administer.getPhone() + "%");
            }
            if (administer.getEmail() != null && administer.getEmail().length() > 0) {
                criteria.andEmailLike("%" + administer.getEmail() + "%");
            }
            if (administer.getStatus() != null && administer.getStatus().length() > 0) {
                criteria.andStatusLike("%" + administer.getStatus() + "%");
            }
            if (administer.getSex() != null && administer.getSex().length() > 0) {
                criteria.andSexLike("%" + administer.getSex() + "%");
            }
            if (administer.getAddress() != null && administer.getAddress().length() > 0) {
                criteria.andAddressLike("%" + administer.getAddress() + "%");
            }
            if (administer.getOther() != null && administer.getOther().length() > 0) {
                criteria.andOtherLike("%" + administer.getOther() + "%");
            }
        }
        Page<TbAdminister> page = (Page<TbAdminister>) administerMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
