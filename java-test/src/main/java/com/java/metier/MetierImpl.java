package com.java.metier;

import org.springframework.stereotype.Service;

import com.java.dao.IDao;

@Service
public class MetierImpl implements IMetier {

	private IDao iDao;

	public MetierImpl(IDao iDao) {
		super();
		this.iDao = iDao;
	}

	public double calcul() {
		// TODO Auto-generated method stub
		double data = iDao.getData();
		double res = data * 10;
		return res;
	}

}
