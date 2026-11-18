package org.example.tlias.service.impl;

import org.example.tlias.mapper.DeptMapper;
import org.example.tlias.pojo.Dept;
import org.example.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
