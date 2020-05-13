package com.shanghaiuniversity.manager.service.impl;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.mapper.DeviceuserMapper;
import com.ShanghaiUniversity.pojo.Deviceuser;
import com.ShanghaiUniversity.pojo.DeviceuserExample;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanghaiuniversity.manager.service.DeviceuserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DeviceuserServiceImpl implements DeviceuserService {

	@Autowired
	private DeviceuserMapper deviceuserMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Deviceuser> findAll() {
		return deviceuserMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Deviceuser> page=   (Page<Deviceuser>) deviceuserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Deviceuser deviceuser) {
		deviceuserMapper.insert(deviceuser);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Deviceuser deviceuser){
		deviceuserMapper.updateByPrimaryKey(deviceuser);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Deviceuser findOne(int id){
		return deviceuserMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			deviceuserMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Deviceuser deviceuser, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		DeviceuserExample example=new DeviceuserExample();
		DeviceuserExample.Criteria criteria = example.createCriteria();
		
		if(deviceuser!=null){			
						if(deviceuser.getUserName()!=null && deviceuser.getUserName().length()>0){
				criteria.andUserNameLike("%"+deviceuser.getUserName()+"%");
			}
			if(deviceuser.getUserPassword()!=null && deviceuser.getUserPassword().length()>0){
				criteria.andUserPasswordLike("%"+deviceuser.getUserPassword()+"%");
			}
			if(deviceuser.getUserPhone()!=null && deviceuser.getUserPhone().length()>0){
				criteria.andUserPhoneLike("%"+deviceuser.getUserPhone()+"%");
			}
			if(deviceuser.getOtherMessage()!=null && deviceuser.getOtherMessage().length()>0){
				criteria.andOtherMessageLike("%"+deviceuser.getOtherMessage()+"%");
			}
	
		}
		
		Page<Deviceuser> page= (Page<Deviceuser>)deviceuserMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
