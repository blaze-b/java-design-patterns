package com.mclebtec.java.proxy.bonus.protectiveproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ManagerInvocationHandler implements InvocationHandler {

    private final EmployeeInterface employeeInterface;

    public ManagerInvocationHandler(EmployeeInterface employeeInterface) {
        this.employeeInterface = employeeInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().contains("Salary"))
            throw new IllegalAccessException();
        if (method.getName().startsWith("get"))
            return method.invoke(employeeInterface, args);
        if (method.getName().startsWith("set"))
            return method.invoke(employeeInterface, args);
        return null;
    }
}
