package com.goonok.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goonok.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc = "/com/goonok/resource/applicationContext.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
		

		context.close();
	}
}
