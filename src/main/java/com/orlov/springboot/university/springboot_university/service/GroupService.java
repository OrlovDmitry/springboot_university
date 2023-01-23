package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dto.AddGroupRequestDto;
import com.orlov.springboot.university.springboot_university.dto.AllGroupIdResponseDto;
import com.orlov.springboot.university.springboot_university.dto.AllGroupResponseDto;
import com.orlov.springboot.university.springboot_university.dto.OneGroupResponseDto;

import java.util.List;

public interface GroupService {
    void addGroup(AddGroupRequestDto addGroupRequestDto);

    List<AllGroupResponseDto> getAllGroups();

    OneGroupResponseDto getGroupById(Integer id);

    List<AllGroupIdResponseDto> findAllGroupsIds();
}
