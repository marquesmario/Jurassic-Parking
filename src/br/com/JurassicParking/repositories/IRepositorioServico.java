package br.com.JurassicParking.repositories;

import br.com.JurassicParking.beans.Servico;

public interface IRepositorioServico {

	 void add(Servico servico);
	 void update(int id, Servico servico );
	 void delete(int id);
	 Servico buscar(int id);
}
