package com.godcorder.myleaf.controller;


import com.godcorder.myleaf.model.Board;
import com.godcorder.myleaf.model.QUsers;
import com.godcorder.myleaf.model.Users;
import com.godcorder.myleaf.repository.AccountRepository;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.RequestedUrlRedirectInvalidSessionStrategy;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@RestController
@RequestMapping("/api")
class UserApiController {

    @Autowired
    private AccountRepository repository;



    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/account")
    Iterable<Users> all(@RequestParam(required = false) String method,@RequestParam(required = false) String text) {
        Iterable<Users> users = null;
        if("query".equals(method)){
           users= repository.findByUsernameQuery(text);
        } else if("querydsl".equals(method)){
            QUsers user = QUsers.users;
           Predicate predicate = user.username.contains(text);
          users= repository.findAll(predicate);

        /*    Predicate predicate = user.firstname.equalsIgnoreCase("dave")
                    .and(user.lastname.startsWithIgnoreCase("mathews"));

            userRepository.findAll(predicate);*/
        }

        else {
            users= repository.findAll();
        }

            return users;


    }
    // end::get-aggregate-root[]

    @PostMapping("/account")
    Users newUsers(@RequestBody Users newUsers) {
        return repository.save(newUsers);
    }

    // Single item

    @GetMapping("/account/{id}")
    Users one(@PathVariable Long id) {

        return repository.findById(id).orElse(null);

    }

    @PutMapping("/account/{id}")
    Users replaceUsers(@RequestBody Users newUsers, @PathVariable Long id) {

        return repository.findById(id)
                .map(user -> {
       /*             employee.setTitle(newUsers.getTitle());
                    employee.setContent(newUsers.getContent());*/
                    user.setBoards(newUsers.getBoards());
                    for(Board board : user.getBoards()){
                        board.setUser(user);
                    }
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUsers.setId(id);
                    return repository.save(newUsers);
                });
    }

    @DeleteMapping("/account/{id}")
    void deleteUsers(@PathVariable Long id) {
        repository.deleteById(id);
    }
}