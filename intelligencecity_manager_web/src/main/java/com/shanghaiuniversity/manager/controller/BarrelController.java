package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.BarrelService;
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
@RequestMapping("/barrel")
public class BarrelController {

    @Reference
    private BarrelService barrelService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Barrel> findAll() {
        return barrelService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return barrelService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param barrel
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Barrel barrel) {
        try {
            barrelService.add(barrel);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param barrel
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Barrel barrel) {
        try {
            barrelService.update(barrel);
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
    public Barrel findOne(int id) {
        return barrelService.findOne(id);
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
            barrelService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param barrel
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Barrel barrel, int page, int rows) {
        return barrelService.findPage(barrel, page, rows);
    }

}
