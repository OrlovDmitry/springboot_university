package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getGroupStudents(int id);

    public void addStudent (Student student);
}
