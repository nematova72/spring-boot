package com.example.springProject.controller;

import com.example.springProject.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {

//    @GetMapping("/student")
//    public String hello(){
//        return "Hello World";
//    }

//    @RequestMapping(value = "/student", method = RequestMethod.GET)
//    public String hello(){
//        return "hello world";
//    }

    @GetMapping("/student")
    public ResponseEntity getAll(){
        Employee student = new Employee(1L,"Nematova","Nargiza", 18);
        Employee student1 = new Employee(1L,"Azizov","Aziz", 23);
        Employee student2 = new Employee(1L,"Anvarova","Anvar", 25);

        List<Employee> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Employee student = new Employee(id,"Nematova","Nargiza", 18);
         return ResponseEntity.ok(student);
    }
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Employee student){

        return ResponseEntity.ok(student);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Employee newStudent){
        Employee student = new Employee(id,"Odil", "Odilov", 28);
        student.setId(id);
        student.setName(newStudent.getName());
        student.setSurname(newStudent.getSurname());
//        student.setAge(newStudent.getAge());
        return ResponseEntity.ok(student);
    }
    @GetMapping("/student/withParam")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String surname,
                                 @RequestParam String name,
                                 @RequestParam int age ){
        Employee student = new Employee(id, surname,name, age);
    return ResponseEntity.ok(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok("Deleted");
    }
}
