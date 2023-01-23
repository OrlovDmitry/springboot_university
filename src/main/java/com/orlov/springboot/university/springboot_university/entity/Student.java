package com.orlov.springboot.university.springboot_university.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="students")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="date_of_enrollment")
    private String enrollmentDate;

    @Column(name="name")
    private String name;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="group_id")
    private Group group;

    public Student(String enrollmentDate, String name, Group group) {
        this.enrollmentDate = enrollmentDate;
        this.name = name;
        this.group = group;
    }


}
