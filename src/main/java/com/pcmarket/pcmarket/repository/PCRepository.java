package com.pcmarket.pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pcmarket.pcmarket.entity.PC;
import com.pcmarket.pcmarket.projection.PCProjection;

@RepositoryRestResource(path = "pc" , excerptProjection = PCProjection.class)
public interface PCRepository extends JpaRepository<PC , Integer> {
	
	@RestResource(path = "findByMatherboard")
	public Page<PC> findAllByMatherboard(@Param("matherboard") String matherboard , Pageable page);
	
	@RestResource(path = "findBySPU")
	public Page<PC> findAllByCpu(@Param("cpu") String cpu , Pageable page);
}
