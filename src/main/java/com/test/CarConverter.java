package com.test;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("carConverter")
public class CarConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value == null) {
			return null;
		}

		CarBean service = (CarBean) fc.getExternalContext().getSessionMap().get("carBean");

		if (service == null) {
			return null;
		}

		return service.getCarByName(value);
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object == null) {
			return null;
		}

		String name = String.valueOf(((Car) object).getName());
		System.out.println(name);
		return name;
	}
}