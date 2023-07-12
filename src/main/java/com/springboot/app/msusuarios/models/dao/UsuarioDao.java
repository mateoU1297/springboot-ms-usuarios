package com.springboot.app.msusuarios.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springboot.app.msusuarioscommons.models.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends CrudRepository<Usuario, Long> {

	@RestResource(path = "buscar-username")
	public Usuario findByUsername(String username);
}
