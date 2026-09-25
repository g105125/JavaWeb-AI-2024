package org.example.hw4.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    Integer id;
    String name;
    String no;
    Integer gender;
    String phone;
    String id_card;
    Integer degree;
    LocalDate graduation_date;
    LocalDateTime create_time;
    LocalDateTime update_time;
}
