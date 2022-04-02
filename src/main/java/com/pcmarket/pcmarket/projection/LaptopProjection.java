package com.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import com.pcmarket.pcmarket.entity.Laptop;

@Projection(name = "laptop" , types = {Laptop.class})
public interface LaptopProjection {
	Integer getId();
	String getCompany();
	String getCpu();
	String getRam();
	String getVideo_card();
	String getHdd();
	String getSsd();
	String getScreen();
	float getPrice();
	boolean getCondition();
	String getDescription();
}
