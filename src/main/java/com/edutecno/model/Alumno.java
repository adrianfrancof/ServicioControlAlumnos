package com.edutecno.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@SequenceGenerator(name = "SQ_ALUMNO",initialValue = 1,allocationSize = 1,sequenceName = "SQ_ALUMNO")//ORACLE
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_ALUMNO")
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private String fechaIngreso;
	@OneToOne
	@JoinColumn(name = "direccion_id",referencedColumnName = "id")//name (nombre de la columna foranea) referencedColumnName (nombre columna referencia)
	private Direccion direccion;//campo para indicar la relacion
	
	//constructor vacio
	//getters y setters
	
//	CREATE TABLE alumno(
//	id INT PRIMARY KEY,
//	rut VARCHAR,
//	nombre VARCHAR,
//	apellido VARCHAR,
//	email VARCHAR,
//	edad INT,
//	fechaIngreso VARCHAR,
//	direcion_id INT,
//	FOREIGN KEY (direccion_id) REFERENCES direccion (id)
//	);
}
