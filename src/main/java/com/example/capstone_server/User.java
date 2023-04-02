package com.example.capstone_server;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public long getNum() {
        return id;
    }

    public String getStr() {
        return name;
    }
}