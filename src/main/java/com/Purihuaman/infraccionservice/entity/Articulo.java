package com.Purihuaman.infraccionservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;



@Entity
@Table(name="articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @Column(length = 8, nullable = false)
    private String DNI;
	
    @Column(nullable = false)
    private LocalDateTime fecha;
    
    @Column(length = 3, nullable = false)
    private String falta;
    
    @Column(length = 200, nullable = false)
    private String infraccion;
    
    @Column(length = 255)
    private String descripcion;
    
    
    @Column(name="created_at", nullable=false,updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
   private Date createdAt;
    
    @Column (name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    @Column(name="activo", nullable=false)
    private Boolean activo;

	
	

}
