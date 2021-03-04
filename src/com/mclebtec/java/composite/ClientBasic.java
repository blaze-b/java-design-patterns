package com.mclebtec.java.composite;

import com.mclebtec.java.composite.basic.Employee;

public class ClientBasic {
    public static void main(String[] args) {
        System.out.println("Inside the method to test the composite design pattern");
        Employee cto = new Employee("Brian", 1);

        Employee level_1_1 = new Employee("Kinesh", 2);
        Employee level_1_2 = new Employee("Karteek", 3);
        Employee level_1_3 = new Employee("Ash", 4);

        Employee level_2_1 = new Employee("Amy", 5);
        Employee level_2_2 = new Employee("Courty", 6);
        Employee level_2_3 = new Employee("Jackson", 7);
        Employee level_2_4 = new Employee("Leticia", 8);

        Employee level_3_1 = new Employee("Peter", 9);
        Employee level_3_2 = new Employee("Jodi", 10);
        Employee level_3_3 = new Employee("William", 11);
        Employee level_3_4 = new Employee("Darly", 12);

        cto.addSubordinate(level_1_1);
        cto.addSubordinate(level_1_2);
        cto.addSubordinate(level_1_3);

        level_1_1.addSubordinate(level_2_1);
        level_1_1.addSubordinate(level_2_2);

        level_1_2.addSubordinate(level_2_3);
        level_1_2.addSubordinate(level_2_4);

        level_2_2.addSubordinate(level_3_1);
        level_2_2.addSubordinate(level_3_2);

        level_2_3.addSubordinate(level_3_3);
        level_2_3.addSubordinate(level_3_4);

        System.out.println("Details of Leaf - Non Manager");
        level_2_2.showEmployeeDetails();

        System.out.println("Details of Branch - Manager");
        level_3_1.showEmployeeDetails();

        System.out.println("Details of full tree / entire organization ");
        cto.showEmployeeDetails();
    }
}
