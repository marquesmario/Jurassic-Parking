package br.com.JurassicParking.repositories;

import java.util.List;

import br.com.JurassicParking.beans.Usuario;

public interface IRepositorioUsuario {

	 void add(Usuario usuario);
	 void update(String cpf, Usuario usuario );
	 void delete(String cpf);
	 Usuario buscar(String cpf);
	 List<Usuario> listar();
	 void ordenarPorCpf();
	 void ordenarPorNome();
	 void ordenarPorTipoUsuario();
}
