/**
 * Copyright (C), 2018-2020
 * FileName: UserDetailsServiceImpl
 * Author:   xjl
 * Date:     2020/5/19 8:45
 * Description: 自主实现类
 */
package com.shanghaiuniversity.user.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构建角色列表
        List<GrantedAuthority> grantAuths = new ArrayList();
        grantAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        //查找到用户
        com.ShanghaiUniversity.pojo.User user = userService.findOne(username);
        if (user != null) {
            return new User(username, user.getUserPassword(), grantAuths);
        } else {
            return null;
        }
    }
}
