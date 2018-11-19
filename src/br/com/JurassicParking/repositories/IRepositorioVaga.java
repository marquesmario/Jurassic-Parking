package br.com.JurassicParking.repositories;

import java.util.List;

import br.com.JurassicParking.beans.Vaga;

public interface IRepositorioVaga {
	 
	 void add(Vaga vaga);
	 void update(int id, Vaga vaga );
	 void delete(int id);
	 Vaga buscar(int id);
	 List<Vaga> listar();
	 void ordenarPorId();
	 void ordenarPorLocal();
	 void ordenarPorTipoVaga();
}
