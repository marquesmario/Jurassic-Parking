package br.com.JurassicParking.negocios.exceptions;

public class FuncionarioNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public FuncionarioNaoExisteException() {
		super("Funcionario não encontrado ou não existe no repositorio");
	}
	
}
