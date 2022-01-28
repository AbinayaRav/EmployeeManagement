package com.employee.EmployeeManagement;

public class ResourceNotFoundException extends RuntimeException {

    private String name;
    private long id;

    public ResourceNotFoundException(String message, String name, long id) {
        super(message+" "+name+" "+id);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }


}
