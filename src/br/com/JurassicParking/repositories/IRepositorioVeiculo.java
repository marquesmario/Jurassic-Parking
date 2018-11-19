package br.com.JurassicParking.repositories;

import java.util.List;

import br.com.JurassicParking.beans.Veiculo;

public interface IRepositorioVeiculo {

	 void add(Veiculo veiculo);
	 void update(String placa, Veiculo veiculo );
	 void delete(String placa);
	 Veiculo buscar(String placa);
	 List<Veiculo> listar();
	 void ordenarPorPlaca();
	 void ordenarPorTipoVeiculo();
	 
}
