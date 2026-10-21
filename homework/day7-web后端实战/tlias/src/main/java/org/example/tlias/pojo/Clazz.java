package org.example.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    String name;
    String room;
    LocalDate beginDate;
    LocalDate endDate;
    Integer masterId;
    Integer subject;
    LocalDateTime createTime;
    LocalDateTime updateTime;
}
