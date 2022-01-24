package com.godcorder.myleaf.repository;

import com.godcorder.myleaf.model.QUsers;
import com.godcorder.myleaf.model.Users;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomizedUserRepositoryImpl implements CustomizedUserRepository{

    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Users> findByCustomUsername(String username) {

        QUsers customer = QUsers.users;
        JPAQuery<?> query = new JPAQuery<Void>(em);
        List<Users> users =  query.select(customer)
                .from(customer)
                .where(customer.username.contains(username))
                .fetch();

        return users;

    }
}
