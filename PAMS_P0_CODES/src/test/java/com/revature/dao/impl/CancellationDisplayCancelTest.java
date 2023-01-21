package com.revature.dao.impl;

import java.util.List;

import org.junit.Test;

import com.revature.dao.CancellationDaoImpl;
import com.revature.model.Order;

public class CancellationDisplayCancelTest {
	
	public void test() {
		CancellationDaoImpl cancelDao = new CancellationDaoImpl();
		cancelDao.displayCancellationDetails(10002);
		List<Appointment> b = CancellationDaoImpl.cancelList;
		assertEquals(b, CancellationDaoImpl.cancelList);
		
	}

}
