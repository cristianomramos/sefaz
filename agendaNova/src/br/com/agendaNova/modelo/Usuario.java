package br.com.agendaNova.modelo;

import java.util.List;

public class Usuario {
	private String nome;
	private String senha;
	private String email;
	private int id;
	private List<Telefone> telefone;
	private Telefone phone;
	
	public Usuario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Telefone getPhone() {
		return phone;
	}

	public void setPhone(Telefone phone) {
		this.phone = phone;
	}
	
		
	
}
