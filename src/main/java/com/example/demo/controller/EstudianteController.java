package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("estudiantes")
public class EstudianteController {

		@Autowired
		private IEstudianteService iEstudianteService;

		@GetMapping("/nuevoEstudiante")
		public String paginaNuevoProducto(Estudiante estudiante) {
			return "nuevoEstudiante";
		}

		@PostMapping("/insertar")
		public String insertarProducto(Estudiante estudiante, Model modelo) {
			this.iEstudianteService.insertar(estudiante);
			estudiante = new Estudiante();
			modelo.addAttribute("estudiante", estudiante);
			return "nuevoEstudiante";
		}
		@GetMapping("/buscar")
		public String vistaEstudiante(Model modelo) {
			List<Estudiante> lista = this.iEstudianteService.buscarTodos();
			modelo.addAttribute("estudiantes", lista);
			return "vistaEstudiantes";
		}
		@DeleteMapping("/borrar/{id}")
		public String borrarEstudiante(@PathVariable("id") Integer id) {
			this.iEstudianteService.eliminar(id);
			return "redirect:/estudiantes/buscar";
		}
		
}
