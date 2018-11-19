package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Servico;
import br.com.JurassicParking.negocios.exceptions.ServicoInvalidoException;
import br.com.JurassicParking.negocios.exceptions.ServicoJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.ServicoNaoExisteException;
import br.com.JurassicParking.repositories.IRepositorioServico;
import br.com.JurassicParking.repositories.RepositorioServico;

public class NegocioServico implements INegocioServico{
	
	private static NegocioServico instancia;
	private IRepositorioServico servico;
	
	private NegocioServico() {
		this.servico = RepositorioServico.getInstance();
	} 
	
	public static synchronized NegocioServico getInstance() {
		if(instancia == null) {
			instancia = new NegocioServico();
		}
		return instancia;
	}

	@Override
	public void adicionar(Servico s1) throws ServicoJaCadastradoException, ServicoInvalidoException{
		if(s1 != null && s1.getId() >= 0 && s1.getNome() != null && s1.getPreco() >= 0 && s1.getTipoServico() >= 0 && this.servico.buscar(s1.getId()) == null) {
			this.servico.add(s1);
		}else if(s1 == null) {
			throw new ServicoInvalidoException();
		}else {
			throw new ServicoJaCadastradoException(s1);
		}
	}

	@Override
	public void editar(int id, Servico s1) throws ServicoNaoExisteException, ServicoInvalidoException {
		if(s1 != null && s1.getId() >= 0 && s1.getNome() != null && s1.getPreco() >= 0 && s1.getTipoServico() >= 0 && this.servico.buscar(id) != null) {
			this.servico.update(id, s1);
		}else if(s1 == null) {
			throw new ServicoInvalidoException();
		}else {
			throw new ServicoNaoExisteException();
		}
		
	}

	@Override
	public Servico buscar(int id) throws ServicoNaoExisteException {
		if(this.servico.buscar(id) != null) {
			return this.servico.buscar(id);
		}else {
			throw new ServicoNaoExisteException();
		}	
	}

	@Override
	public void deletar(int id) throws ServicoNaoExisteException {
		if(this.servico.buscar(id) != null) {
			this.servico.delete(id);
		}else {
			throw new ServicoNaoExisteException();
		}
	}

	@Override
	public List<Servico> listar() {
		return this.servico.listar();
	}	
		
	public void ordenarPorNome() {
		this.servico.ordenarPorNome();
	}
	
	public void ordenarPorId() {
		this.servico.ordenarPorId();
	}
	
	public void ordenarPorTipoServico() {
		this.servico.ordenarPorTipoServico();
	}
}
