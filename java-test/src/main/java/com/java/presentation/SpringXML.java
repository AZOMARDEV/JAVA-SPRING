package com.java.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.metier.IMetier;

public class SpringXML {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier = context.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}
}
