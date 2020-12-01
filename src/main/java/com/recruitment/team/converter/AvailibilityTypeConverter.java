package com.recruitment.team.converter;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

import com.recruitment.team.model.entity.AvailabilityType;
import com.recruitment.team.model.service.AvailabilityTypeService;


@Named
public class AvailibilityTypeConverter  implements  Converter<AvailabilityType>{
	@EJB
	private AvailabilityTypeService service;

	@Override
	public AvailabilityType getAsObject(FacesContext context, UIComponent component, String value) {
		if( value != null) 
			return service.findById(Integer.parseInt(value));
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, AvailabilityType value) {
		if(value != null)
			return String.valueOf(value.getId());
		return null;
	}
}
