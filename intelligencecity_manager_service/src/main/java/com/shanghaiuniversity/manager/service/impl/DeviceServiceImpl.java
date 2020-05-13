package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.DeviceMapper;
import com.ShanghaiUniversity.pojo.Device;
import com.ShanghaiUniversity.pojo.DeviceExample;
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
    private DeviceMapper deviceMapper;

    /**
     * 查询全部
     */
    @Override
    public List<Device> findAll() {
        return deviceMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Device> page = (Page<Device>) deviceMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Device device) {
        deviceMapper.insert(device);
    }

    /**
     * 修改
     */
    @Override
    public void update(Device device) {
        deviceMapper.updateByPrimaryKey(device);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Device findOne(int id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            deviceMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(Device device, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        DeviceExample example = new DeviceExample();
        DeviceExample.Criteria criteria = example.createCriteria();

        if (device != null) {
            if (device.getDeviceLocation() != null && device.getDeviceLocation().length() > 0) {
                criteria.andDeviceLocationLike("%" + device.getDeviceLocation() + "%");
            }
            if (device.getDeviceCompany() != null && device.getDeviceCompany().length() > 0) {
                criteria.andDeviceCompanyLike("%" + device.getDeviceCompany() + "%");
            }
            if (device.getDeviceIp() != null && device.getDeviceIp().length() > 0) {
                criteria.andDeviceIpLike("%" + device.getDeviceIp() + "%");
            }

        }

        Page<Device> page = (Page<Device>) deviceMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
