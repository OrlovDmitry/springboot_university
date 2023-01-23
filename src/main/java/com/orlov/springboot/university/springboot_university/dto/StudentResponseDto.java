package com.orlov.springboot.university.springboot_university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDto {

    private Integer id;
    private String enrollmentDate;
    private String name;

}
