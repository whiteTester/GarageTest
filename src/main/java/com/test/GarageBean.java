package com.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class GarageBean {

	@ManagedProperty("#{carBean}")
	private CarBean carBean;
	private Garage garage;

	public GarageBean() {
	}

	@PostConstruct
	public void init() {
		garage = new Garage();
		garage.setCars(carBean.getCars());
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

}
