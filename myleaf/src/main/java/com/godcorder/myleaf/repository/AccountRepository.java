package com.godcorder.myleaf.repository;

import com.godcorder.myleaf.model.Users;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface AccountRepository extends JpaRepository<Users, Long>, QuerydslPredicateExecutor<Users> {

    @EntityGraph(attributePaths = {"boards"})
    List<Users> findAll();

    Users findByUsername(String name);

    @Query("select u from Users u where u.username like %?1%")
    List<Users> findByUsernameQuery(String username);


}
