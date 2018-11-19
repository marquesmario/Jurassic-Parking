package br.com.JurassicParking.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.JurassicParking.beans.Veiculo;

public class RepositorioVeiculo implements IRepositorioVeiculo{

	private static RepositorioVeiculo instancia;
	private List<Veiculo> listaVeiculo;
	private Map<String,Veiculo> m = new HashMap<String,Veiculo>();
	
	private RepositorioVeiculo() {
		this.listaVeiculo = new ArrayList<Veiculo>();
	}
	
	public static synchronized RepositorioVeiculo getInstance() {
		if(instancia == null) {
			instancia = new RepositorioVeiculo();
		}
		return instancia;
	}
	
	public List<Veiculo> listar() {
		return Collections.unmodifiableList(listaVeiculo);
		
	}
	
	@Override
	public void add(Veiculo veiculo) {
		this.m.put(veiculo.getPlaca(), veiculo);
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
		return this.m.get(placa);
	}
	
	public void ordenarPorPlaca() {
		this.listaVeiculo.sort(Comparator.comparing(t1 -> t1.getPlaca()));
	}
	
	public void ordenarPorTipoVeiculo() {
		this.listaVeiculo.sort(Comparator.comparing(t1 -> t1.getTipoVeiculo()));
	}
}
