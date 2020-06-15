package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.TbDeviceMapper;
import com.ShanghaiUniversity.pojo.TbDevice;
import com.ShanghaiUniversity.pojo.TbDeviceExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private TbDeviceMapper deviceMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbDevice> findAll() {
        return deviceMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbDevice> page = (Page<TbDevice>) deviceMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbDevice device) {
        deviceMapper.insert(device);
    }

    /**
     * 修改
     */
    @Override
    public void update(TbDevice device) {
        deviceMapper.updateByPrimaryKey(device);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbDevice findOne(Long id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            deviceMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbDevice device, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbDeviceExample example = new TbDeviceExample();
        TbDeviceExample.Criteria criteria = example.createCriteria();

        if (device != null) {
            if (device.getAddress() != null && device.getAddress().length() > 0) {
                criteria.andAddressLike("%" + device.getAddress() + "%");
            }
            if (device.getCompany() != null && device.getCompany().length() > 0) {
                criteria.andCompanyLike("%" + device.getCompany() + "%");
            }
            if (device.getStatus() != null && device.getStatus().length() > 0) {
                criteria.andStatusLike("%" + device.getStatus() + "%");
            }
            if (device.getOther() != null && device.getOther().length() > 0) {
                criteria.andOtherLike("%" + device.getOther() + "%");
            }

        }

        Page<TbDevice> page = (Page<TbDevice>) deviceMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
