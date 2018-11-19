package br.com.JurassicParking.negocios.exceptions;

public class VagaNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VagaNaoExisteException() {
		super("Vaga não encontrado ou não existe no repositorio");
	}
	
}
