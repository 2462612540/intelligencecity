package com.shanghaiuniversity.manager.service;
import java.util.List;
import com.shanghaiuniversity.pojo.TbDeviceuser;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface DeviceuserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbDeviceuser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbDeviceuser deviceuser);
	
	
	/**
	 * 修改
	 */
	public void update(TbDeviceuser deviceuser);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbDeviceuser findOne(Long id);
	
	
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
	public PageResult findPage(TbDeviceuser deviceuser, int pageNum, int pageSize);
	
}
