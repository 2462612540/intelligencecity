package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface DeviceuserService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<Deviceuser> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(Deviceuser deviceuser);

    /**
     * 修改
     */
    public void update(Deviceuser deviceuser);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public Deviceuser findOne(int id);

    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(int[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(Deviceuser deviceuser, int pageNum, int pageSize);

}
