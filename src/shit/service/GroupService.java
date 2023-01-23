package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.entity.Group;

import java.util.List;

public interface GroupService {

    public List<Group> getAllGroups();

    public void addGroup(Group group);

}


