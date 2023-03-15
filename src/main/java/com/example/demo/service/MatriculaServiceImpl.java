package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaTemp;
import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.repository.IMateriaRepo;
import com.example.demo.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Autowired
	private IMateriaRepo iMateriaRepo;
	
	@Override
	public void insertar(MatriculaTemp matriculaTemp) {
		// TODO Auto-generated method stub
		Estudiante estu= this.iEstudianteRepo.buscarEstudiante(matriculaTemp.getCedula());
		Materia mate = this.iMateriaRepo.buscarPorCodigo(matriculaTemp.getCodigo());
		Matricula matri = new Matricula();
		matri.setEstudiante(estu);
		matri.setMateria(mate);
		this.iMatriculaRepo.insertar(matri);
		
	}

}
