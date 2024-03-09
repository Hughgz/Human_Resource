package com.example.hris.human_resource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    @Column(length = 10)
    private String sex; // giới tính
    private Date dateOfBirth;
    private String email;
    @Column(length = 10)
    private String phoneNumber;
    @Column(length = 12)
    private String IDCard; // căn cước
    private String address;
    private String avatar;
    @Column(length = 100)
    private String condition_emp;// trạng thái
    @Column(length = 20, nullable = false)
    private String password;

}
