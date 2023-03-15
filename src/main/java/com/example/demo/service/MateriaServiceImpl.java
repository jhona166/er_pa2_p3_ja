package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Materia;
import com.example.demo.repository.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService{
	@Autowired
	private IMateriaRepo iMateriaRepo;
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.insertar(materia);
	}

	@Override
	public Materia buscarPorCodigo(String string) {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.buscarPorCodigo(string);
	}
	
}
