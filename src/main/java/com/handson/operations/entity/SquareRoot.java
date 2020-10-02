package com.handson.operations.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SquareRoot {
	private int number;
	private double square_root;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getRoot() {
		return square_root;
	}
	public void setRoot(double root) {
		this.square_root = root;
	}
}
