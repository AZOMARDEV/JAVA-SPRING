package com.java.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.metier.IMetier;

public class SpringAnnotations {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.java.dao", "com.java.metier");
		IMetier metier = context.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}
}
