package com.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import com.pcmarket.pcmarket.entity.Monitor;

@Projection(name = "monitor" , types = Monitor.class)
public interface MonitorProjection {
	Integer getId();
	String getCompany();
	String getFrequency();
	boolean getCurved();
	String getConnector();
	String getSize();
	String getDiognal_size();
	float getPrice();
	String getDescription();
}
