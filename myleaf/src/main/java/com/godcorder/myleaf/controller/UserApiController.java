package com.godcorder.myleaf.controller;


import com.godcorder.myleaf.model.Board;
import com.godcorder.myleaf.model.Users;
import com.godcorder.myleaf.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
    List<Users> all() {

            return repository.findAll();


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