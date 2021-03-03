package com.mclebtec.java.proxy;

import com.mclebtec.java.proxy.bonus.protectiveproxy.Employee;
import com.mclebtec.java.proxy.bonus.protectiveproxy.EmployeeInterface;
import com.mclebtec.java.proxy.bonus.protectiveproxy.EmployeeInvocationHandler;
import com.mclebtec.java.proxy.bonus.protectiveproxy.ManagerInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.util.Scanner;

import static java.lang.reflect.Proxy.newProxyInstance;

public class ClientBonusProtectiveProxy {

    public static void main(String[] args) {
        System.out.println("Inside the method to test the proxy design pattern");
        Employee employee = new Employee();
        employee.setName("Brian Blaze");
        employee.setRating(10);
        employee.setSalary(10000);

        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        System.out.println("What is your role ? ");
        System.out.println("press 1 for Manger");
        System.out.println("press 2 for Employee");
        int functionalRole = scanner.nextInt();

        EmployeeInterface employeeProxy = getRoleBasedAccessEmployeeProxy(employee, functionalRole);

        while (repeatFlag == 1) {
            System.out.println("What do you want to retrieve from Employee record ");
            System.out.println(" Press 1 for get Name");
            System.out.println(" Press 2 for set Salary ");
            System.out.println(" Press 3 for get Salary  ");
            System.out.println(" Press 4 for set Rating ");
            System.out.println(" Press 5 for get Rating  ");
            int type = scanner.nextInt();
            try {
                switch (type) {
                    case 1:
                        System.out.println(employeeProxy.getName());
                        break;
                    case 2:
                        employeeProxy.setSalary(1000);
                        break;
                    case 3:
                        System.out.println(employeeProxy.getSalary());
                        break;
                    case 4:
                        employeeProxy.setRating(10);
                        break;
                    case 5:
                        System.out.println(employeeProxy.getRating());
                }
            } catch (Exception e1) {
                System.out.println("################ Access is not valid ###############");
            }
            System.out.println("=============================");
            System.out.println("Press 1 to continue and 0 for EXIT .... ");
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }

        }

    }

    private static EmployeeInterface getRoleBasedAccessEmployeeProxy(Employee employee, int functionalRole) {
        InvocationHandler handler;
        if (functionalRole == 1)
            handler = new ManagerInvocationHandler(employee);
        else
            handler = new EmployeeInvocationHandler(employee);
        return (EmployeeInterface) newProxyInstance(employee.getClass().getClassLoader(), employee.getClass().getInterfaces(),
                handler);

    }
}
