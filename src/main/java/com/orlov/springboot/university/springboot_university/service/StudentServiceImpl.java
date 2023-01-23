package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dto.AddStudentRequestDto;
import com.orlov.springboot.university.springboot_university.entity.Group;
import com.orlov.springboot.university.springboot_university.entity.Student;
import com.orlov.springboot.university.springboot_university.repository.GroupRepository;
import com.orlov.springboot.university.springboot_university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    GroupRepository groupRepository;

    @Override
    public void addStudent(AddStudentRequestDto addStudentRequestDto) {

        Group group = groupRepository.findById (addStudentRequestDto.getId ()).orElseThrow ();
        Student student = new Student ();
        student.setEnrollmentDate (addStudentRequestDto.getEnrollmentDate ());
        student.setName (addStudentRequestDto.getName ());
        student.setGroup (group);
        studentRepository.save (student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById (id);
    }
}
