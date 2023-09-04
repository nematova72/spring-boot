package com.example.springProject.controller;

import com.example.springProject.domain.Employee;
import com.example.springProject.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/all")
    public ResponseEntity findAll() {
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }
    @GetMapping("/{name}")
    public ResponseEntity findByName(@PathVariable String name){
        List<Employee> employeeList = employeeService.findByNameQueryNative(name);
        return  ResponseEntity.ok(employeeList);
    }
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }
    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return  ResponseEntity.ok(employee1);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        employeeService.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}

