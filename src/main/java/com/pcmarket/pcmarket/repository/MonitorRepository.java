package com.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pcmarket.pcmarket.entity.Monitor;
import com.pcmarket.pcmarket.projection.MonitorProjection;

@RepositoryRestResource(path = "monitor" , excerptProjection = MonitorProjection.class)
public interface MonitorRepository extends JpaRepository<Monitor, Integer>{

}
