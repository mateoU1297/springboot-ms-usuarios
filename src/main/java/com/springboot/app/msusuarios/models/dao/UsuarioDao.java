package com.springboot.app.msusuarios.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.app.msusuarios.models.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
}
