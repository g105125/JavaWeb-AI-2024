package org.example.tlias.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.tlias.pojo.Dept;
import org.example.tlias.pojo.Result;
import org.example.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    DeptService deptservice;
    @GetMapping
    public Result list(){
        log.info("查询部门列表：");
        List<Dept> depts=deptservice.list();
        Result ret=Result.success(depts);
        return ret;
    }
    @DeleteMapping
    public Result delete(HttpServletRequest request){
        Integer id=Integer.parseInt(request.getParameter("id"));
        log.info("根据id删除部门：{}",id);
        deptservice.deleteById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门:{}",dept);
        deptservice.add(dept);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id){
        log.info("根据id查询部门，id：{}",id);
        return Result.success(deptservice.getById(id));
    }
    @PutMapping
    public Result updateNameById(@RequestBody Dept dept){
        log.info("修改部门:{}",dept);
        deptservice.updateNameById(dept);
        return Result.success();
    }
}
