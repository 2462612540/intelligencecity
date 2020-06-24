package com.shanghaiuniversity.manager.service;

import com.ShanghaiUniversity.pojo.TbAdminister;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 认证类
 *
 * @author Administrator
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    private AdministerService AdministerService;

    public void setAdministerService(com.shanghaiuniversity.manager.service.AdministerService administerService) {
        AdministerService = administerService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构建角色列表
        List<GrantedAuthority> grantAuths = new ArrayList();
        grantAuths.add(new SimpleGrantedAuthority("ROLE_SELLER"));
        //得到商家对象
        TbAdminister TbAdminister = AdministerService.findOne(username);
        if (TbAdminister != null) {
            return new User(username, TbAdminister.getPassword(), grantAuths);
        } else {
            return null;
        }
    }
}
