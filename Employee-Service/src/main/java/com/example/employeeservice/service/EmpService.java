package com.example.employeeservice.service;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public Employee saveEmployee(Employee employee){
        return empRepository.save(employee);
    }

    public Employee findEmployeeById(String userId){
        return empRepository.findEmployeeById(userId);
    }
}
