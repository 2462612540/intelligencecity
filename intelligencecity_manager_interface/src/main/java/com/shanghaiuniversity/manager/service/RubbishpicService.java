package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.pojo.Rubbishpic;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface RubbishpicService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<Rubbishpic> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(Rubbishpic rubbishpic);

    /**
     * 修改
     */
    public void update(Rubbishpic rubbishpic);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public Rubbishpic findOne(Long id);

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
    public PageResult findPage(Rubbishpic rubbishpic, int pageNum, int pageSize);

}
