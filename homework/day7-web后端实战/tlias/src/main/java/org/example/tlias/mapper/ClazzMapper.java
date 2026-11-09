package org.example.tlias.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.tlias.pojo.Clazz;

import java.util.List;

@Mapper
public interface ClazzMapper {
    void add(Clazz clazz);

    List<Clazz> list();
}
