package br.com.JurassicParking.negocios.exceptions;

public class VagaNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VagaNaoExisteException() {
		super("Vaga n�o encontrado ou n�o existe no repositorio");
	}
	
}
