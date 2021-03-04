package com.mclebtec.java.composite.basic;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final Integer empId;
    private final String empName;
    //Composition
    List<Employee> subordinateEmployee = new ArrayList<>();

    public Employee(String empName, Integer empId) {
        this.empId = empId;
        this.empName = empName;
    }

    public void addSubordinate(Employee employee) {
        subordinateEmployee.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinateEmployee.remove(employee);
    }

    public void showEmployeeDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String node = subordinateEmployee.size() == 0 ? "No subordinates" : subordinateEmployee.toString();
        String level = subordinateEmployee.size() == 0 ? "Non Manager" : "Manager";
        return "Employee{" +
                "level = " + level +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", subordinates= " + node +
                '}';
    }
}
