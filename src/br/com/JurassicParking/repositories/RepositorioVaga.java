package br.com.JurassicParking.repositories;

import java.util.ArrayList;

import br.com.JurassicParking.beans.Vaga;

public class RepositorioVaga implements IRepositorioVaga {

	private static RepositorioVaga instancia;
	private ArrayList<Vaga> listaVaga;
	
	private RepositorioVaga() {
		this.listaVaga = new ArrayList<Vaga>();
	}
	
	public static synchronized RepositorioVaga getInstance() {
		if(instancia == null) {
			instancia = new RepositorioVaga();
		}
		return instancia;
	}
	
	@Override
	public void add(Vaga vaga) {
		this.listaVaga.add(vaga);
	}

	@Override
	public void update(int id, Vaga vaga) {
		this.listaVaga.remove(buscar(id));
		this.listaVaga.add(vaga);
		
	}

	@Override
	public void delete(int id) {
		this.listaVaga.remove(buscar(id));
	}

	@Override
	public Vaga buscar(int id) {
		for(Vaga vaga: listaVaga) {
			if(vaga.getId() == id) {
				return vaga;
			}
		}
		return null;
	}

}
