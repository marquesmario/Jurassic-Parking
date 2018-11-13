package br.com.JurassicParking.repositories;

import java.util.ArrayList;

import br.com.JurassicParking.beans.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {

	private static RepositorioUsuario instancia;
	private ArrayList<Usuario> listaUsuario; 
	
	private RepositorioUsuario() {
		this.listaUsuario = new ArrayList<Usuario>();
	}
	
	public static synchronized RepositorioUsuario getInstance() { 
		
		if(instancia == null) {
			instancia = new RepositorioUsuario();
		}
		return instancia;
	}
	@Override
	public void add(Usuario usuario) {
		this.listaUsuario.add(usuario);
	}

	@Override
	public void update(String cpf, Usuario usuario) {
		if(buscar(cpf) != null) {
			this.listaUsuario.remove(buscar(cpf));
			this.listaUsuario.add(usuario);
		}
	}

	@Override
	public void delete(String cpf) {
		if(buscar(cpf) != null) {
			this.listaUsuario.remove(buscar(cpf));
		}
	}

	@Override
	public Usuario buscar(String cpf) {
		for(Usuario usuario: listaUsuario) {
			if(usuario.getCpf().equals(cpf)) {
				return usuario;
			}
		}
		return null;
	}

	
}
