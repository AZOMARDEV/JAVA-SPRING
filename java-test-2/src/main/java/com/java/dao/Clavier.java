package com.java.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Clavier implements USB {

	public int read() {
		// TODO Auto-generated method stub
		System.out.println("je suis un clavier");
		return (int) (Math.random() * 100);
	}

}
