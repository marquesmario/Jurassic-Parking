package br.com.JurassicParking.beans;

public class Servico {
	
	private int id;
	private String nome;
	private double preco;
	private byte tipoServico;

	public Servico(int id, String nome, double preco, byte tipoServico) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tipoServico = tipoServico;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public byte getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(byte tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public boolean equals(Servico outroServico) {
		return (this.nome.equals(outroServico.getNome()) && this.preco == outroServico.getPreco() && this.tipoServico == outroServico.getTipoServico());
	}

	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", preco=" + preco + ", tipoServico=" + tipoServico + "]";
	}

	public int compareTo(String p2) {
		return this.nome.compareTo(p2);
	}
}
