package com.inofttech.spring.rest;

import com.inofttech.spring.rest.configuration.MyConfig;
import com.inofttech.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",Communication.class);
        /*List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);*/

        /*Employee empById = communication.getEmployee(21);
        System.out.println(empById);*/

        /*Employee employee = communication.getEmployee(21);
        employee.setSalary(1900);
        communication.saveEmployee(employee);*/

        communication.deleteEmployee(1);
    }
}
