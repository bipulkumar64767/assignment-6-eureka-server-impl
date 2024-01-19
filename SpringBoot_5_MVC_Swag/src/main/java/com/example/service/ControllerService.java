package com.example.service;

import com.example.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerService
{
    @Autowired
    EmployeeRepo repo;

}
