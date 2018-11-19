package br.com.JurassicParking.repositories;

import br.com.JurassicParking.beans.Servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioServico implements IRepositorioServico{
	
	private static RepositorioServico instancia;
	private List<Servico> listaServico;
	private Map<Integer, Servico> m = new HashMap<Integer, Servico>();
	
	private RepositorioServico() {
		listaServico = new ArrayList<Servico>();
	}
	
	public static synchronized RepositorioServico getInstance() {
		if(instancia == null) {
			instancia = new RepositorioServico();
		}
		return instancia;
	}
	public Servico buscar(int id) {
		return this.m.get(id);
	}
	
	@Override
	public void add(Servico servico) {
		this.m.put(servico.getId(), servico);
		this.listaServico.add(servico);
	}

	@Override
	public void update(int id, Servico servico) {
		if(buscar(id) != null) {
			this.listaServico.remove(buscar(id));
			this.listaServico.add(servico);
		}
	}

	@Override
	public void delete(int id) {
		if(buscar(id) != null) {
			this.listaServico.remove(buscar(id));
		}
	}
	
	public List<Servico> listar() {
		return Collections.unmodifiableList(listaServico);
		
	}
	
	public void ordenarPorNome() {
		this.listaServico.sort(Comparator.comparing(t1 -> t1.getNome()));
	}
	
	public void ordenarPorId() {
		this.listaServico.sort(Comparator.comparing(t1 -> t1.getId()));
	}
	
	public void ordenarPorTipoServico() {
		this.listaServico.sort(Comparator.comparing(t1 -> t1.getTipoServico()));
	}
}
