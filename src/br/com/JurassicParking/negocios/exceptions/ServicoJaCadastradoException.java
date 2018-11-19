package br.com.JurassicParking.negocios.exceptions;

import br.com.JurassicParking.beans.Servico;

public class ServicoJaCadastradoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private Servico s1;
	
	public ServicoJaCadastradoException(Servico s1) {
		super("Ja existe um Servico com mesmo ID cadastrado");
		this.s1 = s1;
	}

	public Servico getS1() {
		return s1;
	}
	
	

}
