package com.employee.EmployeeManagement;

public class ResourceNotFoundException extends RuntimeException {

    private String name;
    private long id;
    private String fieldValue;

    public ResourceNotFoundException(String message, String name, long id) {
        super(message);
        this.name = name;
        this.id = id;
        this.fieldValue = fieldValue;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getFieldValue() {
        return fieldValue;
    }
}
