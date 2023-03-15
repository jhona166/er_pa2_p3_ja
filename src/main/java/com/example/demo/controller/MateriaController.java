package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.service.IMateriaService;

@Controller
@RequestMapping("materias")
public class MateriaController {
	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping("/nuevaMateria")
	public String paginaNuevoProducto(Materia Materia) {
		return "nuevaMateria";
	}

	@PostMapping("/insertar")
	public String insertarProducto(Materia materia, Model modelo) {
		this.iMateriaService.insertar(materia);
		materia = new Materia();
		modelo.addAttribute("materia", materia);
		return "nuevaMateria";
	}
}
