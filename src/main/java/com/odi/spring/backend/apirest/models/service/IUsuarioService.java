package com.odi.spring.backend.apirest.models.service;

import com.odi.spring.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
