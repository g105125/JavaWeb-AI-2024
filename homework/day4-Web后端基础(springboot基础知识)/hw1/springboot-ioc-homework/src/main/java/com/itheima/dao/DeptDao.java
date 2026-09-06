package com.itheima.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface DeptDao {
    public List<String> findAll();
}
