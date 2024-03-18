package com.soporte_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soporte_back.entity.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
	
	@Query(value="SELECT emp.* "
			+ "FROM empleado emp "
			+ "JOIN ( "
			+ "    SELECT emp_id, SUM(valor) AS acumulado "
			+ "    FROM soporte sop "
			+ "    JOIN complejidad com ON sop.comp_id = com.id "
			+ "    WHERE DATE(sop.fecha) = CURDATE() "
			+ "    GROUP BY emp_id "
			+ "    ORDER BY acumulado Desc "
			+ "    LIMIT 1 "
			+ ") AS min_acumulado ON emp.id = min_acumulado.emp_id; "
			, nativeQuery =true)
	Empleado menorTrabajo();

}
