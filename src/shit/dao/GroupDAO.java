package com.orlov.springboot.university.springboot_university.dao;

import com.orlov.springboot.university.springboot_university.entity.Group;

import java.util.List;

public interface GroupDAO {

    public List<Group> getAllGroups();

    public void addGroup(Group group);

}
