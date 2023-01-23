package com.orlov.springboot.university.springboot_university.service;

import com.orlov.springboot.university.springboot_university.dao.GroupDAO;
import com.orlov.springboot.university.springboot_university.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupDAO groupDAO;

    @Override
    @Transactional
    public List<Group> getAllGroups() {
        return groupDAO.getAllGroups ();
    }

    @Override
    @Transactional
    public void addGroup(Group group) {
        groupDAO.addGroup(group);
    }
}
