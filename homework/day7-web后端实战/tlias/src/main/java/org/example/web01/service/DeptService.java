package org.example.web01.service;

import org.example.web01.pojo.Dept;
import org.example.web01.pojo.Result;

import java.util.List;

public interface DeptService {
    public List<Dept> list();

    void deleteById(Integer id);

    void add(Dept dept);

    Dept getById(Integer id);

    void updateNameById(Dept dept);
}
