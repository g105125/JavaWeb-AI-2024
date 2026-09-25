package org.example.hw4;

import org.example.hw4.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.example.hw4.pojo.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class Hw4ApplicationTests {
    @Autowired
    StudentMapper studentmapper;
    @Test
    void contextLoads() {
        System.out.println(studentmapper.findAll());
    }

    @Test
    void insertNewDataTest(){
        System.out.println(studentmapper.insertNewData(new Student(null,"gym","01",1,"110","888888",3,LocalDate.now(), LocalDateTime.now(),LocalDateTime.now())));
    };
    @Test
    void updateByidTest(){
        System.out.println(studentmapper.updateById(new Student(11,"gym","007",1,"110","888888",3,LocalDate.now(), LocalDateTime.now(),LocalDateTime.now())));
    }
    @Test
    void selectByIdTest(){
        System.out.println(studentmapper.selectById(1));
    }
    @Test
    void deleteByIdTest(){
        System.out.println(studentmapper.deleteById(2));
    }
}
