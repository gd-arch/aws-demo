package com.example.AwsDemo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data

public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private String sal;

}
