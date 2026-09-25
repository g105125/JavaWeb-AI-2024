package org.example.hw4.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.hw4.pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> findAll();
    @Insert("INSERT INTO student values (#{id},#{name},#{no},#{gender},#{phone},#{id_card},#{degree},#{graduation_date},#{create_time},#{update_time});")
    public Integer insertNewData(Student student);
    @Update("update student set no=#{no},phone=#{phone},id_card=#{id_card} where id=#{id}")
    public Integer updateById(Student student);
    public Student selectById(Integer id);
    public Student deleteById(Integer id);
}
