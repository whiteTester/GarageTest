package com.test;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<Wheel> wheels;
	private String name;

	public Car() {
		wheels = new ArrayList<Wheel>();
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void removeWheel(Wheel wheel) {
		wheels.remove(wheel);
	}

}
