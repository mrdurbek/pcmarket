package com.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import com.pcmarket.pcmarket.entity.PC;

@Projection(name = "PC" ,  types = { PC.class })
public interface PCProjection {
	
	Integer getId();
	String getName();
	String getMatherboard();
	String getCpu();
	String getRam();
	String getVideo_card();
	String getHdd();
	String getSsd();
	String getPower();
	String getComputer_case();
	String getOs();
	boolean getCondition();
	float getPrice();
	String getDescription();
}
