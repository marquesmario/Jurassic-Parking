package br.com.JurassicParking.negocios.exceptions;

public class UsuarioNaoExisteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioNaoExisteException() {
		super("Usuario não encontrado ou não existe no repositorio");
	}
	

}
