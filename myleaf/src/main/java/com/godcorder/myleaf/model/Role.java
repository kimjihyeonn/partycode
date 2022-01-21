package com.godcorder.myleaf.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {


    @Id
    @GeneratedValue
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    List<Users> users = new ArrayList<>();

}
