package br.com.JurassicParking.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.JurassicParking.beans.Funcionario;


public class RepositorioFuncionario implements IRepositorioFuncionario {

	private static RepositorioFuncionario instancia;
	private List<Funcionario> listaFuncionario;
	private Map<String, Funcionario> m = new HashMap<String, Funcionario>();
	
	private RepositorioFuncionario() {
		this.listaFuncionario = new ArrayList<Funcionario>();
	}
	
	public static synchronized RepositorioFuncionario getInstance() { 
		
		if(instancia == null) {
			instancia = new RepositorioFuncionario();
		}
		return instancia;
	}
	@Override
	public void add(Funcionario funcionario) {
		this.m.put(funcionario.getCpf(), funcionario);
		this.listaFuncionario.add(funcionario);
	}

	@Override
	public void update(String cpf, Funcionario funcionario) {
		if(buscar(cpf) != null) {
			this.listaFuncionario.remove(buscar(cpf));
			this.listaFuncionario.add(funcionario);
		}
	}

	@Override
	public void delete(String cpf) {
		if(buscar(cpf) != null) {
			this.listaFuncionario.remove(buscar(cpf));
		}
	}

	@Override
	public Funcionario buscar(String cpf) {
		return this.m.get(cpf);
	}
	
	public List<Funcionario> listar() {
		return Collections.unmodifiableList(listaFuncionario);
		
	}
	
	public void ordenarPorNome() {
		this.listaFuncionario.sort(Comparator.comparing(t1 -> t1.getNome()));
	}
	
	public void ordenarPorCpf() {
		this.listaFuncionario.sort(Comparator.comparing(t1 -> t1.getCpf()));
	}
	
	public void ordenarPorTipoFuncionario() {
		this.listaFuncionario.sort(Comparator.comparing(t1 -> t1.getTipoFuncionario()));
	}

}
