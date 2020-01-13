package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.Rubbishpic;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.RubbishpicService;
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
@RequestMapping("/rubbishpic")
public class RubbishpicController {

    @Reference
    private RubbishpicService rubbishpicService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Rubbishpic> findAll() {
        return rubbishpicService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return rubbishpicService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param rubbishpic
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Rubbishpic rubbishpic) {
        try {
            rubbishpicService.add(rubbishpic);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param rubbishpic
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Rubbishpic rubbishpic) {
        try {
            rubbishpicService.update(rubbishpic);
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
    public Rubbishpic findOne(int id) {
        return rubbishpicService.findOne(id);
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
            rubbishpicService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param rubbishpic
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Rubbishpic rubbishpic, int page, int rows) {
        return rubbishpicService.findPage(rubbishpic, page, rows);
    }

}
