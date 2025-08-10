package com.wipro.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.beans.Department;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
    	Department department=  (Department)ctx.getBean("department");
    	department.setDeptCode("Fin");
    	department.setDeptName("Finance");
    	System.out.println(department);
    }
}
