package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.pojo.TbMinitorer;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface MinitorerService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<TbMinitorer> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(TbMinitorer minitorer);

    /**
     * 修改
     */
    public void update(TbMinitorer minitorer);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public TbMinitorer findOne(Long id);

    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbMinitorer minitorer, int pageNum, int pageSize);

}
