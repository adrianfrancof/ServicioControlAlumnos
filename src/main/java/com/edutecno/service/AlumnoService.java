package com.edutecno.service;

import java.util.List;

import com.edutecno.model.Alumno;

public interface AlumnoService {
	
	public List<Alumno> findAll();
	public void save(Alumno alumno);
	
	//agregados
	public Alumno findById(Integer id);
	public void update(Alumno alumno);
	public void delete(Alumno alumno);
}
