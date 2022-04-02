package com.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pcmarket.pcmarket.entity.Product;
import com.pcmarket.pcmarket.projection.ProductProjection;

@RepositoryRestResource(path = "product" , excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
