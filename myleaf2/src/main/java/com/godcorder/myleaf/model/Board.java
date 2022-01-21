package com.godcorder.myleaf.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {

     @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
}
