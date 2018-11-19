package br.com.JurassicParking.negocios.exceptions;

public class VeiculoNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VeiculoNaoExisteException() {
		super("Veiculo n�o encontrado ou n�o existe no repositorio");
	}
	
}
