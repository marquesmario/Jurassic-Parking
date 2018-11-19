package br.com.JurassicParking.negocios.exceptions;

public class ServicoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ServicoInvalidoException() {
		super("Servico inválido para cadastro");
	}
}
