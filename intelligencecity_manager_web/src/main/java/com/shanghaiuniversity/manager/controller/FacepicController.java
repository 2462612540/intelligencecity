package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.Facepic;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.FacepicService;
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
@RequestMapping("/facepic")
public class FacepicController {

    @Reference
    private FacepicService facepicService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Facepic> findAll() {
        return facepicService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return facepicService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param facepic
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Facepic facepic) {
        try {
            facepicService.add(facepic);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param facepic
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Facepic facepic) {
        try {
            facepicService.update(facepic);
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
    public Facepic findOne(int id) {
        return facepicService.findOne(id);
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
            facepicService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param facepic
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Facepic facepic, int page, int rows) {
        return facepicService.findPage(facepic, page, rows);
    }

}
