package com.orlov.springboot.university.springboot_university.dao;

import com.orlov.springboot.university.springboot_university.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addStudent(Student student) {
        Session session = entityManager.unwrap (Session.class);
        session.save (student);
    }

    @Override
    public List<Student> getGroupStudents(int id) {

        Session session = entityManager.unwrap (Session.class);
        Query<Student> query = session.createQuery ("from Student where group_id = id", Student.class);
        List<Student> students = query.getResultList ();

        return students;

    }
}
