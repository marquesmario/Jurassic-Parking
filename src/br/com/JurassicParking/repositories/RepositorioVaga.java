package br.com.JurassicParking.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.JurassicParking.beans.Vaga;

public class RepositorioVaga implements IRepositorioVaga {

	private static RepositorioVaga instancia;
	private List<Vaga> listaVaga;
	private Map<Integer, Vaga> m = new HashMap<Integer, Vaga>();
	
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
		this.m.put(vaga.getId(), vaga);
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
		return this.m.get(id);
	}
	
	public List<Vaga> listar() {
		return Collections.unmodifiableList(listaVaga);
	}
	
	public void ordenarPorLocal() {
		this.listaVaga.sort(Comparator.comparing(t1 -> t1.getLocal()));
	}
	
	public void ordenarPorId() {
		this.listaVaga.sort(Comparator.comparing(t1 -> t1.getId()));
	}
	
	public void ordenarPorTipoVaga() {
		this.listaVaga.sort(Comparator.comparing(t1 -> t1.getTipoVaga()));
	}

}
