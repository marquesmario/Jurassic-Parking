package br.com.JurassicParking.negocios.exceptions;

import br.com.JurassicParking.beans.Usuario;

public class UsuarioJaCadastradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario s1;
	
	public UsuarioJaCadastradoException(Usuario s1) {
		super("Ja existe um Usuario com mesmo ID cadastrado");
		this.s1 = s1;
	}

	public Usuario getS1() {
		return s1;
	}
	
	

}
