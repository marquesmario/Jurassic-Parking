package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Vaga;
import br.com.JurassicParking.negocios.exceptions.VagaInvalidaException;
import br.com.JurassicParking.negocios.exceptions.VagaJaCadastradaException;
import br.com.JurassicParking.negocios.exceptions.VagaNaoExisteException;

public interface INegocioVaga {
	
	void adicionar(Vaga s1) throws VagaJaCadastradaException, VagaInvalidaException;
	void editar(int id, Vaga s1) throws VagaNaoExisteException, VagaInvalidaException;
	Vaga buscar(int id) throws VagaNaoExisteException;
	void deletar(int id) throws VagaNaoExisteException;
	List<Vaga> listar();
	void ordenarPorId();
	void ordenarPorLocal();
	void ordenarPorTipoVaga();

}
