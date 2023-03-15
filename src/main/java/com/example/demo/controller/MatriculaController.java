package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaTemp;
import com.example.demo.service.IMatriculaService;

public class MatriculaController {
	@Autowired
	private IMatriculaService iMatriculaService;

	@GetMapping("/nuevaMatricula")
	public String paginaNuevoProducto(Matricula matricula) {
		return "nuevaMatricula";
	}

	@PostMapping("/insertar")
	public String insertarProducto(MatriculaTemp matricula, Model modelo) {
		this.iMatriculaService.insertar(matricula);
		matricula = new Matricula();
		modelo.addAttribute("materia", matriculaTemp);
		return "nuevaMateria";
	}
}
