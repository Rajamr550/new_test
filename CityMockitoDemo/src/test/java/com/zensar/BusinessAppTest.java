package com.zensar;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BusinessAppTest {

	@Test
	public void testBusinessApp() {
		CityService cityService = mock(CityService.class);

		when(cityService.findCitiesByCountries("INDIA")).thenReturn(Arrays.asList("Pune", "Delhi", "Chennai"));

		when(cityService.findCitiesByCountries("USA")).thenReturn(Arrays.asList("Texas"));

		when(cityService.findCitiesByCountries(anyString())).thenReturn(Arrays.asList("city1","city2","city3"));

//				BusinessApp businessApp = new BusinessApp(cityService);
//		assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(), 3);
		
		LoginService loginService = new LoginSeriveStub();
		
		BusinessApp businessApp2 = new BusinessApp(loginService);
		
		//assertEquals(loginService.loginEquals("raja", "raja").equals("true"));
		
		equals(businessApp2.loginEquals("raja", "raja").equals("true"));
		
		
		
		LoginService ls = mock(LoginService.class);
		
		when(ls.login("raja","raja")).thenReturn("raja");
		
	}
		@Test
		public void testMockVsSpy() {
		    List<String> mockList = mock(List.class);
		    mockList.add("ABC");
		    mockList.add("ABCDD");

		    System.out.println("mock " + mockList.get(1));
		    
		    
		    List<String> list = new ArrayList<String>();
		    
		    List<String> spyList = spy(list);
		    spyList.add("ABC");
		    spyList.add("XTZ");
		    System.out.println(spyList.get(1));
		    
		}
		
		
		
		
		
		
		
		
		
	}

