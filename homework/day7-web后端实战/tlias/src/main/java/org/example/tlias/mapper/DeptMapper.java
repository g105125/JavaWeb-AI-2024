package org.example.tlias.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.tlias.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> findAll();

    void deleteById(@Param("id") Integer id);

    void insert(Dept dept);

    Dept getById(Integer id);

    void updateNameById(Dept dept);
}
