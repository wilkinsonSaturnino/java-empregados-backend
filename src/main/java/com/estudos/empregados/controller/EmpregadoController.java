package com.estudos.empregados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.empregados.domain.Empregado;
import com.estudos.empregados.repository.EmpregadoRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class EmpregadoController {

	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	/* Listar todos os Empregados */
	@GetMapping("/empregados")
	public List<Empregado> listarTodosEmpregados() {
		return empregadoRepository.findAll();
	}
	
	/* Salvar Empregado */
	@PostMapping("/empregados")
	public Empregado salvarEmpregado(@RequestBody Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
}
