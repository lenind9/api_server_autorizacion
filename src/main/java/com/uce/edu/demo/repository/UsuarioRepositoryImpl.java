package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Usuario;

@Transactional
@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario consultarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		/*TypedQuery<Usuario> myQuery = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.nombre =: nombre", Usuario.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();*/
		Usuario u = new Usuario();
		u.setNombre("Lenin");
		u.setPassword("$2a$12$dpndOgebKXWEEo1/CAPAvOkZi3T/Vvhwvszx2zvB6KlpNMuc50Tyy");
		return u;
		
	}

}
