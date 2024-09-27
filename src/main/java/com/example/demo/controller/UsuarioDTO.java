package com.example.demo.controller;

import java.util.UUID;

import com.example.demo.model.UsuarioModel;

public record UsuarioDTO(UUID id, String nome, int cpf, int telefone, String email ) {
	
	public UsuarioDTO(UsuarioModel usuario) {
		this(usuario.getId(), usuario.getNome(),
				usuario.getCpf(), usuario.getTelefone(), usuario.getEmail());
	}

}
