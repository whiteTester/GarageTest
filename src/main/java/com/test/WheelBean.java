package com.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class WheelBean {
	private Wheel wheel;

	public WheelBean() {

	}

	@PostConstruct
	public void init() {
		wheel = new Wheel();
	}

	public void reinit() {
		init();
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

}
