package br.com.JurassicParking.negocios.exceptions;

import br.com.JurassicParking.beans.Vaga;

public class VagaJaCadastradaException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private Vaga s1;
	
	public VagaJaCadastradaException(Vaga s1) {
		super("Ja existe um Vaga com mesmo ID cadastrado");
		this.s1 = s1;
	}

	public Vaga getS1() {
		return s1;
	}
	
	

}
