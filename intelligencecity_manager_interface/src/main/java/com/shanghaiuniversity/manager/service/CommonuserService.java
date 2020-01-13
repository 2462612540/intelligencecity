package com.shanghaiuniversity.manager.service;
import java.util.List;
import com.shanghaiuniversity.pojo.TbCommonuser;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CommonuserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCommonuser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCommonuser commonuser);
	
	
	/**
	 * 修改
	 */
	public void update(TbCommonuser commonuser);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCommonuser findOne(Long id);
	
	
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
	public PageResult findPage(TbCommonuser commonuser, int pageNum, int pageSize);
	
}
