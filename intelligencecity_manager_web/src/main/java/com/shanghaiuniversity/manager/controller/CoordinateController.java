package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.TbCoordinate;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.CoordinateService;
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
@RequestMapping("/coordinate")
public class CoordinateController {

    @Reference
    private CoordinateService coordinateService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbCoordinate> findAll() {
        return coordinateService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return coordinateService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param coordinate
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbCoordinate coordinate) {
        try {
            coordinateService.add(coordinate);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param coordinate
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbCoordinate coordinate) {
        try {
            coordinateService.update(coordinate);
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
    public TbCoordinate findOne(Long id) {
        return coordinateService.findOne(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids) {
        try {
            coordinateService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param coordinate
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbCoordinate coordinate, int page, int rows) {
        return coordinateService.findPage(coordinate, page, rows);
    }

}
