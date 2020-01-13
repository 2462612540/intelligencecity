package com.shanghaiuniversity.manager.service;
import java.util.List;
import com.shanghaiuniversity.pojo.TbFacepic;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface FacepicService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbFacepic> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbFacepic facepic);
	
	
	/**
	 * 修改
	 */
	public void update(TbFacepic facepic);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbFacepic findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbFacepic facepic, int pageNum, int pageSize);
	
}
