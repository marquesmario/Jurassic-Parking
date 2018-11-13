package br.com.JurassicParking.beans;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private byte tipoVeiculo;

	
	public Veiculo(String placa, String marca, String modelo, int ano, String cor, byte tipoVeiculo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public byte getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(byte tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public boolean equals(Veiculo outroVeiculo) {
		
		return (this.placa.equals(outroVeiculo.getPlaca()) && this.modelo.equals(outroVeiculo.getModelo()) && this.marca.equals(outroVeiculo.getMarca()) && this.cor.equals(outroVeiculo.getCor()) && this.ano == outroVeiculo.getAno() && this.tipoVeiculo == outroVeiculo.getTipoVeiculo());
	}


	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor
				+ ", tipoVeiculo=" + tipoVeiculo + "]";
	}
	

}
