package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Vaga;
import br.com.JurassicParking.negocios.exceptions.VagaInvalidaException;
import br.com.JurassicParking.negocios.exceptions.VagaJaCadastradaException;
import br.com.JurassicParking.negocios.exceptions.VagaNaoExisteException;
import br.com.JurassicParking.repositories.IRepositorioVaga;
import br.com.JurassicParking.repositories.RepositorioVaga;

public class NegocioVaga implements INegocioVaga {

	private static NegocioVaga instancia;
	private IRepositorioVaga Vaga;
	
	private NegocioVaga() {
		this.Vaga = RepositorioVaga.getInstance();
	} 
	
	public static synchronized NegocioVaga getInstance() {
		if(instancia == null) {
			instancia = new NegocioVaga();
		}
		return instancia;
	}

	@Override
	public void adicionar(Vaga s1) throws VagaJaCadastradaException, VagaInvalidaException{
		if(s1 != null && s1.getId() >= 0 && s1.getLocal() != null && s1.getTipoVaga() >= 0 && this.Vaga.buscar(s1.getId()) == null) {
			this.Vaga.add(s1);
		}else if(s1 == null) {
			throw new VagaInvalidaException();
		}else {
			throw new VagaJaCadastradaException(s1);
		}
	}

	@Override
	public void editar(int id, Vaga s1) throws VagaNaoExisteException, VagaInvalidaException {
		if(s1 != null && s1.getId() >= 0 && s1.getLocal() != null && s1.getTipoVaga() >= 0 && this.Vaga.buscar(id) != null) {
			this.Vaga.update(id, s1);
		}else if(s1 == null) {
			throw new VagaInvalidaException();
		}else {
			throw new VagaNaoExisteException();
		}
		
	}

	@Override
	public Vaga buscar(int id) throws VagaNaoExisteException {
		if(this.Vaga.buscar(id) != null) {
			return this.Vaga.buscar(id);
		}else {
			throw new VagaNaoExisteException();
		}	
	}

	@Override
	public void deletar(int id) throws VagaNaoExisteException {
		if(this.Vaga.buscar(id) != null) {
			this.Vaga.delete(id);
		}else {
			throw new VagaNaoExisteException();
		}
	}
	
	@Override
	public List<Vaga> listar() {
		return this.Vaga.listar();
	}	
	
	@Override
	public void ordenarPorLocal() {
		this.Vaga.ordenarPorLocal();
	}
	
	@Override
	public void ordenarPorId() {
		this.Vaga.ordenarPorId();
	}
	
	@Override
	public void ordenarPorTipoVaga() {
		this.Vaga.ordenarPorTipoVaga();
	}
}
