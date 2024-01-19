package com.example.controller;


import com.example.Repository.EmployeeRepo;
import com.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController
{
    @Autowired
    EmployeeRepo repo;

    @RequestMapping("/seeEmp")
    public List<Employee> seeEmp()
    {
        List<Employee> employess = repo.findAll();
        return employess;
    }
    @RequestMapping("/findEmp")
    public String findEmp(int s)
    {
        Optional<Employee> e1 = repo.findById(s);
        if(e1.isPresent())
        {
            return e1.toString();
        }
        else {
            return "null";
        }

    }
    @RequestMapping("/delEmp")
    public void deleteEmployee(int id)
    {
        repo.deleteById(id);
    }
    @RequestMapping("/upEmp")
    public String updateEmp(int id)
    {
      if(repo.existsById(id))
      {

          //for demo
        return "kfn";
      }
      else
      {
          return "Id doesn't exist";
      }
    }

}
