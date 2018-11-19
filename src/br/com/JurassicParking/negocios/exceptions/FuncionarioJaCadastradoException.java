package br.com.JurassicParking.negocios.exceptions;

import br.com.JurassicParking.beans.Funcionario;

public class FuncionarioJaCadastradoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private Funcionario s1;
	
	public FuncionarioJaCadastradoException(Funcionario s1) {
		super("Ja existe um Funcionario com mesmo CPF cadastrado");
		this.s1 = s1;
	}

	public Funcionario getS1() {
		return s1;
	}
	
	

}
