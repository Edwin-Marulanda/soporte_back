package com.soporte_back.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="soporte")
public class Soporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;
	private Date fecha;
	

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "comp_id", nullable = true)
	private Complejidad complejidad;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "emp_id", nullable = true)
	private Empleado empleado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Complejidad getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(Complejidad complejidad) {
		this.complejidad = complejidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
