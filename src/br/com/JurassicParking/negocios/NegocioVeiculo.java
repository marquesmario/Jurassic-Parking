package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Veiculo;
import br.com.JurassicParking.negocios.exceptions.VeiculoInvalidoException;
import br.com.JurassicParking.negocios.exceptions.VeiculoJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.VeiculoNaoExisteException;
import br.com.JurassicParking.repositories.IRepositorioVeiculo;
import br.com.JurassicParking.repositories.RepositorioVeiculo;

public class NegocioVeiculo implements INegocioVeiculo{


	private static NegocioVeiculo instancia;
	private IRepositorioVeiculo Veiculo;
	
	private NegocioVeiculo() {
		this.Veiculo = RepositorioVeiculo.getInstance();
	} 
	
	public static synchronized NegocioVeiculo getInstance() {
		if(instancia == null) {
			instancia = new NegocioVeiculo();
		}
		return instancia;
	}

	@Override
	public void adicionar(Veiculo s1) throws VeiculoJaCadastradoException, VeiculoInvalidoException{
		if(s1 != null && s1.getAno() >= 1900  && s1.getCor() != null && s1.getMarca() != null && s1.getModelo() != null && s1.getPlaca() != null && this.Veiculo.buscar(s1.getPlaca()) == null) {
			this.Veiculo.add(s1);
		}else if(s1 == null) {
			throw new VeiculoInvalidoException();
		}else {
			throw new VeiculoJaCadastradoException(s1);
		}
	}

	@Override
	public void editar(String Placa, Veiculo s1) throws VeiculoNaoExisteException, VeiculoInvalidoException {
		if(s1 != null && s1.getAno() >= 1900  && s1.getCor() != null && s1.getMarca() != null && s1.getModelo() != null && s1.getPlaca() != null && this.Veiculo.buscar(Placa) != null) {
			this.Veiculo.update(Placa, s1);
		}else if(s1 == null) {
			throw new VeiculoInvalidoException();
		}else {
			throw new VeiculoNaoExisteException();
		}
		
	}

	@Override
	public Veiculo buscar(String placa) throws VeiculoNaoExisteException {
		if(this.Veiculo.buscar(placa) != null) {
			return this.Veiculo.buscar(placa);
		}else {
			throw new VeiculoNaoExisteException();
		}	
	}

	@Override
	public void deletar(String placa) throws VeiculoNaoExisteException {
		if(this.Veiculo.buscar(placa) != null) {
			this.Veiculo.delete(placa);
		}else {
			throw new VeiculoNaoExisteException();
		}
	}

	@Override
	public List<Veiculo> listar() {
		return this.Veiculo.listar();
	}	
		
	public void ordenarPorPlaca() {
		this.Veiculo.ordenarPorPlaca();
	}
	
	public void ordenarPorTipoVeiculo() {
		this.Veiculo.ordenarPorTipoVeiculo();
	}
}
