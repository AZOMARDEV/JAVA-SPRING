package com.java.presentation;

import java.io.File;
import java.util.Scanner;

import com.java.dao.IDao;
import com.java.metier.IMetier;

public class IstanciationDynamique {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("Config.txt"));
		String classname = scanner.nextLine();
		System.out.println(classname);
		Class classDao = Class.forName(classname);
		IDao iDao = (IDao) classDao.getConstructor().newInstance();

		String classname2 = scanner.nextLine();
		System.out.println(classname2);

		Class classMetier = Class.forName(classname2);

		IMetier iMetier = (IMetier) classMetier.getConstructor(IDao.class).newInstance(iDao);
		System.out.println(iMetier.calcul());
	}
}
