package com.employee.EmployeeManagement.Repository;

import com.employee.EmployeeManagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> Q1();

    @Query(value = "select * from employee where employee_id = :customid", nativeQuery = true)
    Employee Q2(@Param(value = "customid") int id);
}
