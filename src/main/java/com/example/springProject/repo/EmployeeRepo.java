package com.example.springProject.repo;

import com.example.springProject.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);

    List<Employee> findByNameAndSurname(String name, String surname);

//    @Query("select e from Employee e where e.surname = :surname")
//    List<Employee> findBySurnameQuery(@Param("name") String surname);

    @Query(value = "select * from Employee e where e.name = :name", nativeQuery = true)
    List<Employee> findByNameQueryNative(@Param("name") String name);
}
