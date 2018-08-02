package com.example.mbpdemo1.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.ApiResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mbpdemo1.entity.TblEmployee;
import com.example.mbpdemo1.service.TblEmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TblEmployee)表控制层
 *
 * @author makejava
 * @since 2018-08-03 01:33:59
 */
@RestController
@RequestMapping("tblEmployee")
public class TblEmployeeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TblEmployeeService tblEmployeeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tblEmployee 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ApiResult selectAll(Page<TblEmployee> page, TblEmployee tblEmployee) {
        return success(this.tblEmployeeService.page(page, new QueryWrapper<>(tblEmployee)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ApiResult selectOne(@PathVariable Serializable id) {
        return success(this.tblEmployeeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tblEmployee 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ApiResult insert(@RequestBody TblEmployee tblEmployee) {
        return success(this.tblEmployeeService.save(tblEmployee));
    }

    /**
     * 修改数据
     *
     * @param tblEmployee 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ApiResult update(@RequestBody TblEmployee tblEmployee) {
        return success(this.tblEmployeeService.updateById(tblEmployee));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ApiResult delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tblEmployeeService.removeByIds(idList));
    }
}