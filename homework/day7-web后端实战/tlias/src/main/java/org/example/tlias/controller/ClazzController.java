package org.example.tlias.controller;

import org.example.tlias.pojo.Clazz;
import org.example.tlias.pojo.Result;
import org.example.tlias.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/clazzs")
@RestController
public class ClazzController {
    @Autowired
    ClazzService clazzservice;

    @PostMapping
    public Result add(@RequestBody Clazz clazz){
        clazzservice.add(clazz);
        return Result.success();
    }
}
