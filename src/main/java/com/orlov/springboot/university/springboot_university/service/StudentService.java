package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dto.AddGroupRequestDto;
import com.orlov.springboot.university.springboot_university.dto.AddStudentRequestDto;
import com.orlov.springboot.university.springboot_university.dto.OneGroupResponseDto;

public interface StudentService {


    void addStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudent(Integer id);
}

