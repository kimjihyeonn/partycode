package com.godcorder.myleaf.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Getter
@Setter
public class Board {

     @Id @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=2, max=30, message = "제목은 30자 이상입니다.")
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Users user;


}
