package br.com.JurassicParking.repositories;

import br.com.JurassicParking.beans.Vaga;

public interface IRepositorioVaga {
	 
	 void add(Vaga vaga);
	 void update(int id, Vaga vaga );
	 void delete(int id);
	 Vaga buscar(int id);
}
