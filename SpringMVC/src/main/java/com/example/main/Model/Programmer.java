package com.example.main.Model;

public class Programmer {
	
	private int pID;
	private String pName;
	private String pLang;
	
	
	public Programmer() {
		super();
	}

	public Programmer(int pID, String pName, String pLang) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pLang = pLang;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpLang() {
		return pLang;
	}

	public void setpLang(String pLang) {
		this.pLang = pLang;
	}
	
	@Override
	public String toString() {
		return "Programmer [pid = " +pID+ ", pName = " + pName + ", pLang = "+pLang+"]";
	}

}
