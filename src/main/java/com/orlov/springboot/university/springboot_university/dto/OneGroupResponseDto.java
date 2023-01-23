package com.orlov.springboot.university.springboot_university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OneGroupResponseDto {

    private Integer id;
    private String number;
    private List<StudentResponseDto> list;

}
