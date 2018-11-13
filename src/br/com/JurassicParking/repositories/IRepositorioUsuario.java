package br.com.JurassicParking.repositories;

import br.com.JurassicParking.beans.Usuario;

public interface IRepositorioUsuario {

	 void add(Usuario usuario);
	 void update(String cpf, Usuario usuario );
	 void delete(String cpf);
	 Usuario buscar(String cpf);
}
