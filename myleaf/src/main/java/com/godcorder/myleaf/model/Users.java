package com.godcorder.myleaf.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Users {


    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private Boolean enabled;


    @ManyToMany
    @JoinTable(name = "user_role"
    ,joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns =@JoinColumn(name="role_id"))
    List<Role> roles = new ArrayList<>();


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    List<Board> boards = new ArrayList<>();

}
