package br.com.JurassicParking.repositories;

import br.com.JurassicParking.beans.Servico;
import java.util.ArrayList;

public class RepositorioServico implements IRepositorioServico{
	
	private static RepositorioServico instancia;
	private ArrayList<Servico> listaServico;
	
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
		
		for(Servico serv: listaServico) {
			if(serv.getId() == id) {
				return serv;
			}
		}
		return null;
	}
	
	@Override
	public void add(Servico servico) {
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

}
