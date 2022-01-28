package com.employee.EmployeeManagement.Model;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Employee {
    @Id
    @Column(name = "EmployeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "empName", length = 30)
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name of the employee should not contain any special characters! Only spaces and letters are allowed!")
    @NotNull(message = "Employee name should not be null")
    private String empName;
    @Column(name = "EmployeeAge")
    @Min(10)
    @Max(value = 100, message = "Enter a value between 10 and 100")
    private int age;

    public Employee() {
    }

    public Employee(int id, String empName, int age) {
        this.id = id;
        this.empName = empName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}
