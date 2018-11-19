package br.com.JurassicParking.negocios.exceptions;

import br.com.JurassicParking.beans.Veiculo;

public class VeiculoJaCadastradoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private Veiculo s1;
	
	public VeiculoJaCadastradoException(Veiculo s1) {
		super("Ja existe um Veiculo com mesma Placa cadastrada");
		this.s1 = s1;
	}

	public Veiculo getS1() {
		return s1;
	}
	
	

}
