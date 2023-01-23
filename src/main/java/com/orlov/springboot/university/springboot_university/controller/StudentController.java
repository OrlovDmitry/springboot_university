package com.orlov.springboot.university.springboot_university.controller;

import com.orlov.springboot.university.springboot_university.dto.AddStudentRequestDto;
import com.orlov.springboot.university.springboot_university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void addStudent (@RequestBody AddStudentRequestDto addStudentRequestDto){
        studentService.addStudent(addStudentRequestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent (@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
