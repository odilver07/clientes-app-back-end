package com.odi.spring.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.odi.spring.backend.apirest.models.entity.Factura;

public interface IFacturaDao  extends CrudRepository<Factura, Long>{

}
