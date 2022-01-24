package com.godcorder.myleaf.repository;

import com.godcorder.myleaf.model.Users;

import java.util.List;

public interface CustomizedUserRepository {

    List<Users> findByCustomUsername(String username);
}
