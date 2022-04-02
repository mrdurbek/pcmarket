package com.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import com.pcmarket.pcmarket.entity.Product;

@Projection(name = "product" , types = {Product.class})
public interface ProductProjection {
	Integer getId();
	String getName();
}
