package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	public void insertar(Estudiante estudiante);
	public Estudiante buscarEstudiante(String cedula);
	public Estudiante buscarPorId(Integer id);
	public void eliminar(Integer id);
	public List<Estudiante> buscarTodos();
}
