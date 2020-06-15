package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface FacepicService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<Facepic> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(Facepic facepic);

    /**
     * 修改
     */
    public void update(Facepic facepic);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public Facepic findOne(int id);

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
    public PageResult findPage(Facepic facepic, int pageNum, int pageSize);

}
