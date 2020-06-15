package com.shanghaiuniversity.manager.controller;

import com.ShanghaiUniversity.entity.PageResult;
import com.ShanghaiUniversity.entity.Result;
import com.ShanghaiUniversity.pojo.TbRubpicture;
import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghaiuniversity.manager.service.RubpictureService;
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
@RequestMapping("/rubpicture")
public class RubpictureController {

    @Reference
    private RubpictureService rubpictureService;

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbRubpicture> findAll() {
        return rubpictureService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return rubpictureService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param rubpicture
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbRubpicture rubpicture) {
        try {
            rubpictureService.add(rubpicture);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param rubpicture
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbRubpicture rubpicture) {
        try {
            rubpictureService.update(rubpicture);
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
    public TbRubpicture findOne(Long id) {
        return rubpictureService.findOne(id);
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
            rubpictureService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param rubpicture
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbRubpicture rubpicture, int page, int rows) {
        return rubpictureService.findPage(rubpicture, page, rows);
    }

}
