package org.example.tlias.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.tlias.pojo.Dept;
import org.example.tlias.pojo.Result;
import org.example.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    DeptService deptservice;
    @GetMapping
    public Result list(){
        List<Dept> depts=deptservice.list();
        Result ret=Result.success(depts);
        return ret;
    }
    @DeleteMapping
    public Result delete(HttpServletRequest request){
        Integer id=Integer.parseInt(request.getParameter("id"));
        deptservice.deleteById(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Dept dept){
        deptservice.add(dept);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id){
        return Result.success(deptservice.getById(id));
    }
    @PutMapping
    public Result updateNameById(@RequestBody Dept dept){
        deptservice.updateNameById(dept);
        return Result.success();
    }
}
