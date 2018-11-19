package br.com.JurassicParking.repositories;

import java.util.List;

import br.com.JurassicParking.beans.Funcionario;

public interface IRepositorioFuncionario {

	 void add(Funcionario funcionario);
	 void update(String cpf, Funcionario funcionario);
	 void delete(String cpf);
	 Funcionario buscar(String cpf);
	 List<Funcionario> listar();
	 void ordenarPorCpf();
	 void ordenarPorNome();
	 void ordenarPorTipoFuncionario();
}
