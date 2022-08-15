package com.edutecno.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@SequenceGenerator(name = "SQ_DIRECCION",initialValue = 1,allocationSize = 1,sequenceName = "SQ_DIRECCION")//ORACLE
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_DIRECCION")
	private Integer id;
	private String calle;
	private String numero;
	private String ciudad;
	@Enumerated(EnumType.STRING)
	private TipoDireccion tipo;
	
	//constructor vacio
	//getters y setters
	
	
//	CREATE TABLE direccion(
//	id INT,
//	calle VARCHAR,
//	numero VARCHAR,
//	ciudad VARCHAR,
//	tipo VARCHAR
//	)
}
