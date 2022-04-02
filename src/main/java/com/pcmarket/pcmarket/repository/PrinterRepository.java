 package com.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pcmarket.pcmarket.entity.Printer;

@RepositoryRestResource(path = "printer" , excerptProjection = Printer.class)
public interface PrinterRepository extends JpaRepository<Printer, Integer> {
	
}
