package com.estudos.empregados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.empregados.domain.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
	
}
