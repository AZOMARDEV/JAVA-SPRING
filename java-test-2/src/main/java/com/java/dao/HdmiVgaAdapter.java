package com.java.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HdmiVgaAdapter implements VGA {

	private HDMI hdmi;

	public HdmiVgaAdapter(HDMI hdmi) {
		super();
		this.hdmi = hdmi;
	}

	public void print(String message) {
		// TODO Auto-generated method stub
		byte[] b = message.getBytes();
		hdmi.print(b);
	}

}
