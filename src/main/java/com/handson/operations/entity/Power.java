package com.handson.operations.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Power {
	private int base;
	private int power=2;
	private double result;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public int getPower() {
		return power;
	}
}
