package com.example;

import com.example.dao.HibernateEmployeeDAO;
import com.example.entity.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(50000);

        HibernateEmployeeDAO dao = new HibernateEmployeeDAO();
        Integer id = dao.addEmployee(emp);
        System.out.println("Inserted Employee ID: " + id);
    }
}
f