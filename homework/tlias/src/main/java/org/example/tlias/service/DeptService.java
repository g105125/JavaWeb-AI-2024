package org.example.tlias.service;

import org.example.tlias.pojo.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> list();

    void deleteById(Integer id);

    void add(Dept dept);

    Dept getById(Integer id);

    void updateNameById(Dept dept);
}
