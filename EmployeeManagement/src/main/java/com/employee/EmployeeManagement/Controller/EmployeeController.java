package com.employee.EmployeeManagement.Controller;

import com.employee.EmployeeManagement.Model.Employee;
import com.employee.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    Employee getEmployeeById(@PathVariable(name = "id") Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    Employee addNewEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.addNewEmployee(employee);
    }

    @PutMapping("/updateEmployee/{id}")
    Employee updateEmployee(@PathVariable(name = "id") Integer id, @RequestBody Employee updateEmployee) {
        return employeeService.updateEmployee(id, updateEmployee);
    }
     //another line added$$$$$$$$$$$$$$$
    @DeleteMapping("/deleteEmployee/{id}")
    String deleteEmployeeById(@PathVariable(name = "id") Integer id) {
        return employeeService.deleteEmployeeById(id);
    }
}
