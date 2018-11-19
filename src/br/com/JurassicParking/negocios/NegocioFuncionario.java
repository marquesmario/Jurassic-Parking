package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Funcionario;
import br.com.JurassicParking.negocios.exceptions.FuncionarioInvalidoException;
import br.com.JurassicParking.negocios.exceptions.FuncionarioJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.FuncionarioNaoExisteException;
import br.com.JurassicParking.repositories.IRepositorioFuncionario;
import br.com.JurassicParking.repositories.RepositorioFuncionario;

public class NegocioFuncionario implements INegocioFuncionario {

	private static NegocioFuncionario instancia;
	private IRepositorioFuncionario Funcionario;
	
	private NegocioFuncionario() {
		this.Funcionario = RepositorioFuncionario.getInstance();
	} 
	
	public static synchronized NegocioFuncionario getInstance() {
		if(instancia == null) {
			instancia = new NegocioFuncionario();
		}
		return instancia;
	}

	@Override
	public void adicionar(Funcionario s1) throws FuncionarioJaCadastradoException, FuncionarioInvalidoException{
		if(s1 != null && s1.getCpf() != null && s1.getEmail() != null && s1.getIdade() != 0 && s1.getNome() != null && s1.getRG() != 0 && (s1.getSexo() == 'M' || s1.getSexo() == 'F' || s1.getSexo() == 'O') && this.Funcionario.buscar(s1.getCpf()) == null) {
			this.Funcionario.add(s1);
		}else if(s1 == null) {
			throw new FuncionarioInvalidoException();
		}else {
			throw new FuncionarioJaCadastradoException(s1);
		}
	}

	@Override
	public void editar(String Cpf, Funcionario s1) throws FuncionarioNaoExisteException, FuncionarioInvalidoException {
		if(s1 != null && s1.getCpf() != null && s1.getEmail() != null && s1.getIdade() != 0 && s1.getNome() != null && s1.getRG() != 0 && (s1.getSexo() == 'M' || s1.getSexo() == 'F' || s1.getSexo() == 'O') && this.Funcionario.buscar(Cpf) != null) {
			this.Funcionario.update(Cpf, s1);
		}else if(s1 == null) {
			throw new FuncionarioInvalidoException();
		}else {
			throw new FuncionarioNaoExisteException();
		}
		
	}

	@Override
	public Funcionario buscar(String placa) throws FuncionarioNaoExisteException {
		if(this.Funcionario.buscar(placa) != null) {
			return this.Funcionario.buscar(placa);
		}else {
			throw new FuncionarioNaoExisteException();
		}	
	}

	@Override
	public void deletar(String placa) throws FuncionarioNaoExisteException {
		if(this.Funcionario.buscar(placa) != null) {
			this.Funcionario.delete(placa);
		}else {
			throw new FuncionarioNaoExisteException();
		}
	}

	@Override
	public List<Funcionario> listar() {
		return this.Funcionario.listar();
	}	
		
	public void ordenarPorNome() {
		this.Funcionario.ordenarPorNome();
	}
	
	public void ordenarPorCpf() {
		this.Funcionario.ordenarPorCpf();
	}
	
	public void ordenarPorTipoFuncionario() {
		this.Funcionario.ordenarPorTipoFuncionario();
	}
}
