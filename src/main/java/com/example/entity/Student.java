package com.example.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;


@Entity(name="student")
@Table
@Data
@ToString
public class Student {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String companyName;
}
