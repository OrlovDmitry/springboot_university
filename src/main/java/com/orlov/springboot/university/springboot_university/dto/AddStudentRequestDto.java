package com.orlov.springboot.university.springboot_university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequestDto {

    private Integer id;                 // это id группы, который передаётся при добавлении студента
    private String enrollmentDate;
    private String name;
}
