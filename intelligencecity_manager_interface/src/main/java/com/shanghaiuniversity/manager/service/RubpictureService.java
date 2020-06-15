package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.pojo.TbRubpicture;

import java.util.List;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface RubpictureService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<TbRubpicture> findAll();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加
     */
    public void add(TbRubpicture rubpicture);

    /**
     * 修改
     */
    public void update(TbRubpicture rubpicture);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public TbRubpicture findOne(Long id);

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
    public PageResult findPage(TbRubpicture rubpicture, int pageNum, int pageSize);

}
