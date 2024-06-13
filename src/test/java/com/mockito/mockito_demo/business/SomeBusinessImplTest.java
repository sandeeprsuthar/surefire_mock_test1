package com.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void test() {
		DataServiceStub dataServiceStub=new DataServiceStub();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{25,15,5};
	}
	
}
