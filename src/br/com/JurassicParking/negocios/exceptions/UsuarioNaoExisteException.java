package br.com.JurassicParking.negocios.exceptions;

public class UsuarioNaoExisteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioNaoExisteException() {
		super("Usuario n�o encontrado ou n�o existe no repositorio");
	}
	

}
