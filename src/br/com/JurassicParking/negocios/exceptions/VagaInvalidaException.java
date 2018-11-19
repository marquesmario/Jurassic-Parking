package br.com.JurassicParking.negocios.exceptions;

public class VagaInvalidaException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VagaInvalidaException() {
		super("Vaga inválida para cadastrar");
	}
}
