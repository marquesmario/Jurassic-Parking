package br.com.JurassicParking.repositories;

import java.util.ArrayList;

import br.com.JurassicParking.beans.Veiculo;

public class RepositorioVeiculo implements IRepositorioVeiculo{

	private static RepositorioVeiculo instancia;
	private ArrayList<Veiculo> listaVeiculo;
	
	private RepositorioVeiculo() {
		this.listaVeiculo = new ArrayList<Veiculo>();
	}
	
	public static synchronized RepositorioVeiculo getInstancia() {
		if(instancia == null) {
			instancia = new RepositorioVeiculo();
		}
		return instancia;
	}
	
	public ArrayList<Veiculo> listar() {
		return listaVeiculo;
		
	}
	
	@Override
	public void add(Veiculo veiculo) {
		this.listaVeiculo.add(veiculo);
	}

	@Override
	public void update(String placa, Veiculo veiculo) {
		this.listaVeiculo.remove(buscar(placa));
		this.listaVeiculo.add(veiculo);
	}

	@Override
	public void delete(String placa) {
		this.listaVeiculo.remove(buscar(placa));
	}

	@Override
	public Veiculo buscar(String placa) {
		for(Veiculo veiculo: listaVeiculo) {
			if(veiculo.getPlaca().equals(placa)) {
				return veiculo;
			}
		}
		return null;
	}

}
