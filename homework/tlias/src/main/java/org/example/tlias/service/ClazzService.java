package org.example.tlias.service;

import org.example.tlias.pojo.Clazz;

import java.util.List;

public interface ClazzService {
    void add(Clazz clazz);

    List<Clazz> list();
}
