package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface DeviceService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<Device> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(Device device);

    /**
     * 修改
     */
    public void update(Device device);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public Device findOne(int id);

    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(int[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(Device device, int pageNum, int pageSize);

}
