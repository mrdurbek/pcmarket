package com.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import com.pcmarket.pcmarket.entity.Printer;

@Projection(name = "printer" , types = {Printer.class})
public interface PrinterProjection {
	Integer getId();
	String getCompany();
	boolean getColored();
	boolean getTwo_sided();
	String getFunction();
	String getFormat();
	String getSpeed();
	String getTechnology();
	String getConnection();
	boolean getCondition();
	float getPrice();
	String getDescription();
}
