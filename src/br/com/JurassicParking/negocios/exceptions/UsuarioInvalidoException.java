package br.com.JurassicParking.negocios.exceptions;

public class UsuarioInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioInvalidoException() {
		super("Usuario invalido para cadastro");
	}
}
