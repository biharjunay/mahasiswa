package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name =  "shoes")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long name;
    private long age;
    private String address;
}
