package com.example.employeeservice.repository;

import com.example.employeeservice.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends MongoRepository<Employee, String> {

    Employee findEmployeeById(String userId);
}

