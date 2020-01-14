/**
 * Copyright (C), 2018-2019
 * FileName: NetConnection
 * Author:   Administrator
 * Date:     2019/12/22 13:16
 * Description: 网络测试连接的类
 */
package com.shanghaiuniversity.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/net")
public class NetConnection {

    /**
     * f返回测试连接网络
     * @return
     */
    @RequestMapping("/connection")
    public String connection(){
        return "net connection success";
    }

}
