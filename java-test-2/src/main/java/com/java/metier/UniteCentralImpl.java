package com.java.metier;

import org.springframework.stereotype.Service;

import com.java.dao.USB;
import com.java.dao.VGA;

@Service
public class UniteCentralImpl implements UniteCentral {

	private VGA vga;
	private USB usb;

	public UniteCentralImpl(VGA vga, USB usb) {
		super();
		this.vga = vga;
		this.usb = usb;
	}

	public int readData() {

		return usb.read();
	}

	public void printData(String data) {
		vga.print(data);
	}

}
