package com.Purihuaman.infraccionservice.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Purihuaman.infraccionservice.entity.Articulo;

@Repository
public interface ArticuloRepository  extends  JpaRepository<Articulo, Integer>
{
	List<Articulo> findByNombreContaining(String DNI,Pageable page);

}
