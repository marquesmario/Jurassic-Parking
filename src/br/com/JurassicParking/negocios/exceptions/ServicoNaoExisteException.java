package br.com.JurassicParking.negocios.exceptions;

public class ServicoNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ServicoNaoExisteException() {
		super("Servico não encontrado ou não existe no repositorio");
	}
	
}
