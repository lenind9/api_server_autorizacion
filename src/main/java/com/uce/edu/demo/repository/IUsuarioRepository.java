package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Usuario;

public interface IUsuarioRepository {
	public Usuario consultarPorNombre(String nombre);
}
