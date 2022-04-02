package com.pcmarket.pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pcmarket.pcmarket.entity.Laptop;
import com.pcmarket.pcmarket.projection.LaptopProjection;

@RepositoryRestResource(path = "laptop" , excerptProjection = LaptopProjection.class)
public interface LaptopRepository extends JpaRepository<Laptop , Integer> {
	
	@RestResource(path = "findByCompany")
	public Page<Laptop> findAllByCompany(@Param("company") String company , Pageable page);
	
	@RestResource(path = "findBySPU")
	public Page<Laptop> findAllByCpu(@Param("CPU") String cpu , Pageable page);
}
