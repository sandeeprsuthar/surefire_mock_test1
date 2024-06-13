 	package com.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Test
	void test4() {
		DataService dataServiceMock=mock(DataService.class);
		//dataServiceMock.retrieveAllData() == >> new int[] {10,20,30};
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {10,20,30});  
		
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(30, result);
	}
	
	@Test
	void test5() {
		DataService dataServiceMock=mock(DataService.class);
		//dataServiceMock.retrieveAllData() == >> new int[] {10,20,30};
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});  
		
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceMock);
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

	@Mock
	DataService dataServiceMock3;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl3;
	
	@Test
	void test6() {
		when(dataServiceMock3.retrieveAllData()).thenReturn(new int[] {25});  
		assertEquals(25, businessImpl3.findTheGreatestFromAllData());
	}
}

