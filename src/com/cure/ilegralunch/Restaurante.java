package com.cure.ilegralunch;

public class Restaurante {
	private String nome;
	private char pertoLonge;
	
	public Restaurante(String nome, char pertoLonge) {
		this.nome = nome;
		this.pertoLonge = pertoLonge;
	}
	
	public String getNome() {
		return this.nome;
	}
}
