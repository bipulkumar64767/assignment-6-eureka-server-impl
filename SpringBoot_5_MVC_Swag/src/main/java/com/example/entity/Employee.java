package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Employee
{
    @Id
    private Integer eId;
    private String eName;
    private Double eSal;
}
