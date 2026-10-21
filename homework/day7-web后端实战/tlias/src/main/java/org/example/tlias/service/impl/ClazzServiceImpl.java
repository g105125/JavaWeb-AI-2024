package org.example.tlias.service.impl;

import org.example.tlias.mapper.ClazzMapper;
import org.example.tlias.pojo.Clazz;
import org.example.tlias.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzMapper clazzmapper;
    @Override
    public void add(Clazz clazz) {
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(clazz.getCreateTime());
        clazzmapper.add(clazz);
    }
}
