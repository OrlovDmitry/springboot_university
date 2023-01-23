package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dao.StudentDAO;
import com.orlov.springboot.university.springboot_university.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getGroupStudents(int id) {
        List<Student> students = studentDAO.getGroupStudents (id);
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent (student);
    }
}
