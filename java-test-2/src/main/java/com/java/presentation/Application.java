package com.java.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.metier.UniteCentral;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.java.dao", "com.java.metier");
		UniteCentral uc = context.getBean(UniteCentral.class);
		uc.printData("hi every one");
		System.out.println(uc.readData());
	}
}
