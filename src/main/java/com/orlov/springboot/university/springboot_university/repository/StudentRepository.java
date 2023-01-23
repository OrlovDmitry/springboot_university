package com.orlov.springboot.university.springboot_university.repository;

import com.orlov.springboot.university.springboot_university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {
}
