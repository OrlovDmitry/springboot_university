package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dto.*;
import com.orlov.springboot.university.springboot_university.entity.Group;
import com.orlov.springboot.university.springboot_university.entity.Student;
import com.orlov.springboot.university.springboot_university.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {

        Group group = new Group ();         // создание группы
        group.setNumber (addGroupRequestDto.getNumber ()); //инициализация параметров группы из Dto слоя

        groupRepository.save (group);   // методы уже содержатся в JpaRepository
    }

    @Override
    public List<AllGroupResponseDto> getAllGroups() {
        return groupRepository.findAll()   // нужно сходить в базу данных
                .stream ()
                .map (group -> {
                    return getGroupResponseDtoFromGroup (group);
                }).collect (Collectors.toList ());
    }
    
    @Override
    public OneGroupResponseDto getGroupById(Integer id) {
        Group group = groupRepository.findById (id).orElseThrow (); // чтобы уйти от Optional. Либо найдёт группу, либо кинет Exception, если null
        OneGroupResponseDto oneGroupResponseDto = new OneGroupResponseDto ();
        oneGroupResponseDto.setId (group.getId ());
        oneGroupResponseDto.setNumber (group.getNumber ());
        oneGroupResponseDto.setList (group.getStudents ().stream ()
                .map(student -> {
                    return getStudentResponseDto (student);
                }).collect(Collectors.toList()));
        return oneGroupResponseDto;
    }

    @Override
    public List<AllGroupIdResponseDto> findAllGroupsIds() {
        return groupRepository.findAllGroupsIds ()
                .stream ()
                .map (value -> {
                    AllGroupIdResponseDto allGroupIdResponseDto = new AllGroupIdResponseDto ();
                    allGroupIdResponseDto.setId (value);
                    return allGroupIdResponseDto;
                }).collect(Collectors.toList());
    }

    private StudentResponseDto getStudentResponseDto(Student student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto ();
        studentResponseDto.setId (student.getId ());
        studentResponseDto.setEnrollmentDate (student.getEnrollmentDate ());
        studentResponseDto.setName (student.getName ());
        return studentResponseDto;
    }

    private AllGroupResponseDto getGroupResponseDtoFromGroup(Group group) {
        AllGroupResponseDto allGroupResponseDto = new AllGroupResponseDto ();
        allGroupResponseDto.setId (group.getId ());
        allGroupResponseDto.setNumber ((group.getNumber ()));
        allGroupResponseDto.setStudentQuantity (group.getStudents ().size ());
        return allGroupResponseDto;
    }
}
