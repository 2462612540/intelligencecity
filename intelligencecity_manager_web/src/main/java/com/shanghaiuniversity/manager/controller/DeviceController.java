package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.DeviceService;
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
@RequestMapping("/device")
public class DeviceController {

    @Reference
    private DeviceService deviceService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Device> findAll() {
        return deviceService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return deviceService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param device
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Device device) {
        try {
            deviceService.add(device);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param device
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Device device) {
        try {
            deviceService.update(device);
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
    public Device findOne(int id) {
        return deviceService.findOne(id);
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
            deviceService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param device
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Device device, int page, int rows) {
        return deviceService.findPage(device, page, rows);
    }

}
