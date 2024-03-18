package com.soporte_back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soporte_back.entity.Empleado;
import com.soporte_back.repository.EmpleadoRepository;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired 
	private EmpleadoRepository empleadoRepository;
	
		@Override
	@Transactional
	public Empleado menorTrabajo() {
		return empleadoRepository.menorTrabajo();
	}
}
