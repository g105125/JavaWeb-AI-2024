package org.example.tlias.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.tlias.pojo.Clazz;

@Mapper
public interface ClazzMapper {
    void add(Clazz clazz);
}
