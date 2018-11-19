package br.com.JurassicParking.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.JurassicParking.beans.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {

	private static RepositorioUsuario instancia;
	private List<Usuario> listaUsuario;
	private Map<String, Usuario> m = new HashMap<String, Usuario>();
	
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
		this.m.put(usuario.getCpf(), usuario);
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
		return this.m.get(cpf);
	}
	
	public List<Usuario> listar() {
		return Collections.unmodifiableList(listaUsuario);
		
	}

	public void ordenarPorNome() {
		this.listaUsuario.sort(Comparator.comparing(t1 -> t1.getNome()));
	}
	public void ordenarPorCpf() {
		this.listaUsuario.sort(Comparator.comparing(t1 -> t1.getCpf()));
	}	
	public void ordenarPorTipoUsuario() {
		this.listaUsuario.sort(Comparator.comparing(t1 -> t1.getTipoUsuario()));
	}
}
