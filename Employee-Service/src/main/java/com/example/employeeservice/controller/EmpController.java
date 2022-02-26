package com.example.employeeservice.controller;


import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmpController {

    private EmpService empService;

    @PostMapping("/")
    public Employee saveEmployee (@RequestBody Employee employee){

        return empService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById (@PathVariable("id") String employeeId)
    {
        return empService.findEmployeeById(employeeId);
    }
}
