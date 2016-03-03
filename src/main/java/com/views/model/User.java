package com.views.model;

import java.io.Serializable;

public class User implements Serializable {
	private int ID;
	private String Name;
	
	public User(){}
	public User(int ID,String Name){
		this.ID=ID;
		this.Name=Name;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	

}
