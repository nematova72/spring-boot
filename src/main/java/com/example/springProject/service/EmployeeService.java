package com.example.springProject.service;

import com.example.springProject.domain.Employee;
import com.example.springProject.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private final EmployeeRepo employeeRepo;
    // inject of employee repository to use methods

    public EmployeeService( EmployeeRepo employeeRepo) {

        this.employeeRepo = employeeRepo;
    }

    public Employee save(Employee employee){

        return employeeRepo.save(employee);
    }
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

    public Employee findById(Long id){
        return employeeRepo.findById(id).get();
    }

    public List<Employee> findByNameQueryNative(String name){
        return employeeRepo.findByNameQueryNative(name);
    }

    public void delete(Long id){
        Employee employee = employeeRepo.getOne(id);
        employeeRepo.delete(employee);
    }
}
