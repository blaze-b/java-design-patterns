package com.mclebtec.java.proxy.bonus.protectiveproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler {

    private final EmployeeInterface employeeInterface;

    public EmployeeInvocationHandler(EmployeeInterface emp) {
        this.employeeInterface = emp;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().contains("setSalary"))
            throw new IllegalAccessException();
        if (method.getName().contains("get"))
            return method.invoke(employeeInterface, args);
        return null;
    }
}
