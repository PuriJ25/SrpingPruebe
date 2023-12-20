package com.Purihuaman.infraccionservice.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Purihuaman.infraccionservice.entity.Articulo;
import com.Purihuaman.infraccionservice.repository.ArticuloRepository;
import com.Purihuaman.infraccionservice.service.ArticuloService;

import jakarta.transaction.Transactional;

@Service
public class ArticuloServiceImpl  implements ArticuloService{
	
	@Autowired
	private ArticuloRepository repository;
	
	
	
	

	@Override
	@Transactional
	public List<Articulo> findAll(Pageable page) {
		
		try {
			
		}catch(Exception e) {
		return null;
		}
		
		return null;
	}

	@Override
	public List<Articulo> findByDni(String DNI, Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo save(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo update(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}

}
