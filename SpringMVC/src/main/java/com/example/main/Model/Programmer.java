package com.example.main.Model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Programmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProgrammerId")
	private int pID;
	@Column(name = "ProgrammerName")
	private String pName;
	@Column(name = "ProgrammerLanguage")
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
