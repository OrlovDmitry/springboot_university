package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dto.AllGroupResponseDto;
import com.orlov.springboot.university.springboot_university.dto.OneGroupResponseDto;
import com.orlov.springboot.university.springboot_university.entity.Group;
import com.orlov.springboot.university.springboot_university.entity.Student;
import com.orlov.springboot.university.springboot_university.repository.GroupRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith (MockitoExtension.class)
//@DataJpaTest
class GroupServiceTest {

    @Mock
    private GroupRepository testRepo;

    @Autowired
    private GroupServiceImpl impl;


    @Test
    void addGroup() {
        Group group = new Group (1,"Group 1", new ArrayList<Student> ());
        Mockito.verify (testRepo,Mockito.times (1)).save (group);
    }

    @Test
    void getAllGroups() {
//        Mockito.doReturn(groupList).when (groupRepository).findAll ();
        List<AllGroupResponseDto> allGroupResponseDtos = List
                .of (new AllGroupResponseDto (1,"1",2));
        assertEquals (allGroupResponseDtos,testRepo.findAll ());
    }


    @Test
    void getGroupById_Should_Return_Dto() {
        // given
        Group group = new Group (1,"Group 1", new ArrayList<Student>());
        Mockito.when (testRepo.findById (1)).thenReturn (Optional.of (group));
        // when
        OneGroupResponseDto responseDto = impl.getGroupById (1);
        // then
        assertEquals (new OneGroupResponseDto (1,"1", new ArrayList<> ()), responseDto);
    }

    @Test
    void findAllGroupsIds() {
    }
}