package com.java.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TV implements HDMI {

	public void print(byte[] data) {
		// TODO Auto-generated method stub
		String d = new String(data);
		System.out.println(" TV : " + d);
	}

}
