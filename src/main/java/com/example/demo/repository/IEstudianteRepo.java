package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
		public void insertar(Estudiante estudiante);
		public Estudiante buscarEstudiante(String cedula);
		public Estudiante buscarPorId(Integer id);
		public void eliminar(Integer id);
		public List<Estudiante> buscarTodos();
}
