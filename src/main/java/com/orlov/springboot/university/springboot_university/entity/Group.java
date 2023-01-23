package com.orlov.springboot.university.springboot_university.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "university_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="group_number")
    private String number;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private List<Student> students;

    public Group(String number) {
        this.number = number;
    }

    public Group(Integer id, String number) {
        this.id = id;
        this.number = number;
    }
}
