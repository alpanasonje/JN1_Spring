//program to demonstrate accessing beans from xml file.
package com.tnsif.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tns.annotations.Employee;
public class LifeCycleDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource.xml");
		System.out.println("------------------");
		
		/*
		 * Address addressObj=context.getBean("obj1",Address.class);
		 * System.out.println(addressObj);
		 * 
		 * addressObj=context.getBean("obj2",Address.class);
		 * System.out.println(addressObj);
		 * 
		 * Person personObj=context.getBean("personObj", Person.class);
		 * System.out.println(personObj);
		 * 
		 * personObj=context.getBean("personObj1", Person.class);
		 * System.out.println(personObj);
		 * 
		 * personObj=context.getBean("personObj2", Person.class);
		 * System.out.println(personObj);
		 * 
		 * 		
		PersonOne personOneObj=context.getBean("personObj3", PersonOne.class);
		System.out.println(personOneObj);
		

		Department dept=context.getBean("dept",Department.class);
		System.out.println(dept);
		
		Employee obj=context.getBean("empOne",Employee.class);
		System.out.println(obj);
		obj.display();
		 */
		
		Employee employee =context.getBean("res_employee",Employee.class);
		employee.displayEmpInfo();

		((AbstractApplicationContext) context).close();
	}

}
