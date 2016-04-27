package model;

import java.io.Serializable;

public class User implements Serializable {
	private int id,pw;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {}
	public User(int id, int pw){
		this.id=id;this.pw=pw;

	}
}
