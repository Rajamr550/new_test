package com.zensar;

import java.util.List;

public class BusinessApp {
//	CityService cityServicez
    
    LoginService ls;
	
	public BusinessApp(LoginService ls) {
		this.ls = ls;
	}
	
//	public List<String> retrieveCityListByCountry(String country) {
//		List<String> cities =  this.cityService.findCitiesByCountries(country);
//		return cities;
//	}
	
	public String loginEquals(String name,String pass) {
	    if(name.equals(pass))
		return "true";
	    
	    return "false";
	}
}