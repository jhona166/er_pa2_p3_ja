package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
	this.entityManager.persist(estudiante);	
	}

	@Override
	public Estudiante buscarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula:=datoCedula",Estudiante.class);
		myQuery.setParameter("datoCedula",cedula);
		
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Estudiante.class, id);	
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estu = this.buscarPorId(id);
		this.entityManager.remove(estu);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e",Estudiante.class);
		
		return myQuery.getResultList();
	}

}
