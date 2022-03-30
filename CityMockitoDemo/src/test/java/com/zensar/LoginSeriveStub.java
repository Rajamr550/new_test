package com.zensar;

public class LoginSeriveStub implements LoginService {

    public String loginEquals(String name, String pass) {
	
	if(name.equals(pass))
	{
	    return "true";
	}
		
	return "False";
    }

    public String login(String name, String pass) {
	// TODO Auto-generated method stub
	if(name.equals(pass))
	{
	    return "true";
	}
		
	return "False";
    }

}
