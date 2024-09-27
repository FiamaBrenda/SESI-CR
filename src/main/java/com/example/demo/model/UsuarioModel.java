package com.example.demo.model;

import java.util.UUID;

import com.example.demo.controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String nome;
	private int cpf;
	private int telefone;
	private String email;
	
	public UsuarioModel() {}

	public UsuarioModel(UsuarioDTO dados) {
		this.id = dados.id();
		this.nome = dados.email();
		this.cpf = dados.cpf();
		this.telefone = dados.telefone();
		this.email = dados.email();
	}

	public UsuarioModel(UUID id, String nome, int cpf, int telefone, String email) {
		this.id = id;
		this.nome = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
