package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Servico;
import br.com.JurassicParking.negocios.exceptions.ServicoInvalidoException;
import br.com.JurassicParking.negocios.exceptions.ServicoJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.ServicoNaoExisteException;

public interface INegocioServico {

	void adicionar(Servico s1) throws ServicoJaCadastradoException, ServicoInvalidoException;
	void editar(int id, Servico s1) throws ServicoNaoExisteException, ServicoInvalidoException;
	Servico buscar(int id) throws ServicoNaoExisteException;
	void deletar(int id) throws ServicoNaoExisteException;
	List<Servico> listar();
	void ordenarPorNome();
	void ordenarPorId();
	void ordenarPorTipoServico();
	
}
