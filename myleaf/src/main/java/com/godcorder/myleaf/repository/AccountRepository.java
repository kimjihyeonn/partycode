package com.godcorder.myleaf.repository;

import com.godcorder.myleaf.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Users, Long> {

    Users findByUsername(String name);


}
