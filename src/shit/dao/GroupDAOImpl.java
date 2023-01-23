package com.orlov.springboot.university.springboot_university.dao;

import com.orlov.springboot.university.springboot_university.entity.Group;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private EntityManager entityManager;

    public List<Group> getAllGroups(){
        Session session = entityManager.unwrap (Session.class);

        Query<Group> query = session.createQuery ("from Group", Group.class);
        List<Group> allGroups = query.getResultList ();

        return allGroups;
    }

    @Override
    public void addGroup(Group group) {     // Нужно ли здесть делить saveOrUpdate() на два метода?

        Session session = entityManager.unwrap (Session.class);
        session.save (group);
    }


}
