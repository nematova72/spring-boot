package com.example.springProject.model;

public class Employee
{

    private Long id;
    private String  surname;

    private String name;
    private int age;

    public Employee(Long id, String surname, String name, int age) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
