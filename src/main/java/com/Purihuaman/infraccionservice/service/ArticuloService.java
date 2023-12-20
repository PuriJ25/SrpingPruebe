package com.Purihuaman.infraccionservice.service;

import java.awt.print.Pageable;
import java.util.List;

import com.Purihuaman.infraccionservice.entity.Articulo;

public interface ArticuloService {
	
	public List<Articulo> findAll(Pageable page);
	public List<Articulo> findByDni(String  DNI, Pageable page);
	public Articulo findById(int id);
	public Articulo save(Articulo articulo);
	public Articulo update (Articulo articulo);
	

}
