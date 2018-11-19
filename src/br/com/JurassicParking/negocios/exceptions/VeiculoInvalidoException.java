package br.com.JurassicParking.negocios.exceptions;

public class VeiculoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VeiculoInvalidoException() {
		super("Veiculo inválido para cadastrar");
	}
}
