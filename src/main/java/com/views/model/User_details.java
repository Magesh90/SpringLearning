package com.views.model;

import java.io.Serializable;

public class User_details implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String User_Name;

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_Passoword() {
		return User_Passoword;
	}

	public void setUser_Passoword(String user_Passoword) {
		User_Passoword = user_Passoword;
	}

	private String User_Passoword;

}
