package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UsuarioModel;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("user")
public class UsuarioController {

	@Autowired
	UsuarioRepository repository;

	@GetMapping
	public List<UsuarioModel> listarUsuarios() {
		List<UsuarioModel> lista = repository.findAll();
		return lista;
	}
	
	@PostMapping
	public void salvarUsuario(@RequestBody UsuarioDTO dados) {
		UsuarioModel userdata = new UsuarioModel(dados);
		repository.save(userdata);
		
	}
}
