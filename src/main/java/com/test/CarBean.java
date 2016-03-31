package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarBean {

	private List<Car> cars;
	private Car currentCar;
	private Car selectedCar;

	public CarBean() {

	}

	@PostConstruct
	public void init() {
		cars = new ArrayList<Car>();
		currentCar = new Car();
		selectedCar = new Car();
		createStandardCars();
	}

	private void createStandardCars() {

		Car car1 = new Car();
		car1.setName("Car1");

		Wheel wheel1 = new Wheel();
		wheel1.setName("Wheel1");

		Wheel wheel2 = new Wheel();
		wheel2.setName("Wheel2");

		List<Wheel> wheels1 = new ArrayList<Wheel>();

		wheels1.add(wheel1);
		wheels1.add(wheel2);

		car1.setWheels(wheels1);

		cars.add(car1);

		Car car2 = new Car();
		car2.setName("Car2");

		Wheel wheel3 = new Wheel();
		wheel3.setName("Wheel3");

		Wheel wheel4 = new Wheel();
		wheel4.setName("Wheel4");

		List<Wheel> wheels2 = new ArrayList<Wheel>();

		wheels2.add(wheel3);
		wheels2.add(wheel4);
		car2.setWheels(wheels2);

		cars.add(car2);

	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car getCarByName(String value) {
		for (Car car : cars) {
			if (car.getName().equals(value)) {
				return car;
			}
		}
		return null;
	}

	public Car getCurrentCar() {
		return currentCar;
	}

	public void setCurrentCar(Car currentCar) {
		this.currentCar = currentCar;
	}

	public Car getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(Car selectedCar) {
		this.selectedCar = selectedCar;
	}

}
