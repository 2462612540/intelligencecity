package com.shanghaiuniversity.user.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.Commonuser;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.user.service.CommonuserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/commonuser")
public class CommonuserController {

    @Reference
    private CommonuserService commonuserService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Commonuser> findAll() {
        return commonuserService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return commonuserService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param commonuser
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Commonuser commonuser) {
        //BCryptPasswordEncoder密码加密
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String password = passwordEncoder.encode(commonuser.getUserPassword());//加密
        commonuser.setUserPassword(password);
        try {
            commonuserService.add(commonuser);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param commonuser
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Commonuser commonuser) {
        try {
            commonuserService.update(commonuser);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     *
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Commonuser findOne(int id) {
        return commonuserService.findOne(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(int[] ids) {
        try {
            commonuserService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param commonuser
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Commonuser commonuser, int page, int rows) {
        return commonuserService.findPage(commonuser, page, rows);
    }

}
