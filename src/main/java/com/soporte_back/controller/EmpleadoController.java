package com.soporte_back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soporte_back.entity.Empleado;
import com.soporte_back.service.EmpleadoService;

@RestController
@RequestMapping("api/empleado")
@CrossOrigin(origins="*")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	

	
	@GetMapping("menortrabajo")
	public ResponseEntity<Empleado> menorTabajo(){
		Empleado empleado = empleadoService.menorTrabajo();
		return new ResponseEntity(empleado, HttpStatus.OK);
	}
	
	
}
