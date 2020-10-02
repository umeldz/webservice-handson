package com.handson.operations.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Binary {
	private int number;
	private String binary;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBinary() {
		return binary;
	}
	public void setBinary(String binary) {
		this.binary = binary;
	}
	
	

}
