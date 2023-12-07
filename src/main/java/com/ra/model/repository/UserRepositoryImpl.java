package com.ra.model.repository;

import com.ra.model.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    // tiem SessionFactory
    private SessionFactory sessionFactory;
    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        // khoi tao doi tuong sesssion
        Session session = sessionFactory.openSession();
        try {
            list = session.createQuery("from User").list();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public User saveOrUpdate(User user) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
