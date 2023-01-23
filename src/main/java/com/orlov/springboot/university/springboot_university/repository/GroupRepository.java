package com.orlov.springboot.university.springboot_university.repository;

import com.orlov.springboot.university.springboot_university.dto.AllGroupIdResponseDto;
import com.orlov.springboot.university.springboot_university.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

    @Query(value = "SELECT id FROM university_db.university_groups", nativeQuery = true)
    List<Integer> findAllGroupsIds();
}
