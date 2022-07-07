package com.example.demo.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Employee {
    private Long id ;
    private String FirstName ;
    private String LastName ;
    private String emailId ;
    }



