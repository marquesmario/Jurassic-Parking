package br.com.JurassicParking.beans;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String email;
	protected int RG;
	protected int idade;
	protected char sexo;
	
	public Pessoa(String nome, String cpf, String email, int RG, int idade, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.RG = RG;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
