package com.example.demo.model;

import java.io.Serializable;

public class SomethingModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2624040855519790561L;
	String name;
	int keyNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKeyNumber() {
		return keyNumber;
	}

	public void setKeyNumber(int keyNumber) {
		this.keyNumber = keyNumber;
	}

}
