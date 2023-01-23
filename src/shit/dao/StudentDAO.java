package com.orlov.springboot.university.springboot_university.dao;

import com.orlov.springboot.university.springboot_university.entity.Student;

import java.util.List;

public interface StudentDAO {

    public void addStudent (Student student);

    public List<Student> getGroupStudents(int id);

}
