package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        annualSalary = salary;
    }


    public String getFirstName() {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        this.lastName = lastName;
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        fullName = lastName + ", " + firstName;
        return fullName;
    }

    public String getDepartment() {
        this.department = department;
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeId() {
        this.employeeId = employeeId;
        return employeeId;
    }

    public double getAnnualSalary() {
        this.annualSalary = annualSalary;
        return annualSalary;
    }

    public void raiseSalary(double percent) {
        percent = percent / 100;
        double raiseAmount = annualSalary * percent;
        annualSalary = annualSalary + raiseAmount;
    }
}
