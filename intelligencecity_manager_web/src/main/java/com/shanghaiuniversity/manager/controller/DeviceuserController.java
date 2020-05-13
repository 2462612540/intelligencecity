package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.Deviceuser;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.DeviceuserService;
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
@RequestMapping("/deviceuser")
public class DeviceuserController {

    @Reference
    private DeviceuserService deviceuserService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Deviceuser> findAll() {
        return deviceuserService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return deviceuserService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param deviceuser
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Deviceuser deviceuser) {
        try {
            deviceuserService.add(deviceuser);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param deviceuser
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Deviceuser deviceuser) {
        try {
            deviceuserService.update(deviceuser);
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
    public Deviceuser findOne(int id) {
        return deviceuserService.findOne(id);
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
            deviceuserService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param deviceuser
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Deviceuser deviceuser, int page, int rows) {
        return deviceuserService.findPage(deviceuser, page, rows);
    }

}
