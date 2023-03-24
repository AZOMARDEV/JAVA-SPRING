package com.java.presentation;

import com.java.dao.DaoImpl;
import com.java.dao.IDao;
import com.java.metier.MetierImpl;

public class InstanciationStatique {

	public static void main(String[] args) {
		IDao iDao = new DaoImpl();
		MetierImpl metierImpl = new MetierImpl(iDao);
		System.out.println(metierImpl.calcul());
	}
}
