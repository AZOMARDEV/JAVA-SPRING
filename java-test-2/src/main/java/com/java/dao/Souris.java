package com.java.dao;

public class Souris implements USB {

	public int read() {
		// TODO Auto-generated method stub
        System.out.println("je suis une souris");
        return (int) (Math.random()*100);
	}

}
