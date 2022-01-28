package com.employee.EmployeeManagement.Service;


import com.employee.EmployeeManagement.Model.Employee;
import com.employee.EmployeeManagement.Repository.EmployeeRepository;
import com.employee.EmployeeManagement.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No Found ", "Employee", id));
    }

    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee updateEmployee) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found", "Employee", id));
        employee.setEmpName(updateEmployee.getEmpName());
        employee.setAge(updateEmployee.getAge());
        return employeeRepository.save(employee);
    }

    public String deleteEmployeeById(Integer id) {
        employeeRepository.delete(employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not founde", "Employee", id)));
        if (!employeeRepository.findById(id).isPresent())
            return "Deletion successful";
        else
            return "Couldn't perform deletion";
    }


}
