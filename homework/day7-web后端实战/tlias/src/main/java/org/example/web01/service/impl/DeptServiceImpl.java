package org.example.web01.service.impl;

import org.example.web01.mapper.DeptMapper;
import org.example.web01.pojo.Dept;
import org.example.web01.pojo.Result;
import org.example.web01.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptmapper;
    @Override
    public List<Dept> list() {
        List<Dept> depts=deptmapper.findAll();
        return depts;
    }

    @Override
    public void deleteById(Integer id) {
        deptmapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(dept.getCreateTime());
        deptmapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptmapper.getById(id);
    }

    @Override
    public void updateNameById(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptmapper.updateNameById(dept);
    }
}
