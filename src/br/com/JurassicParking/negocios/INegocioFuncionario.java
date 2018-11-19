package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Funcionario;
import br.com.JurassicParking.negocios.exceptions.FuncionarioInvalidoException;
import br.com.JurassicParking.negocios.exceptions.FuncionarioJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.FuncionarioNaoExisteException;

public interface INegocioFuncionario {

	void adicionar(Funcionario s1) throws FuncionarioJaCadastradoException, FuncionarioInvalidoException;
	void editar(String Cpf, Funcionario s1) throws FuncionarioNaoExisteException, FuncionarioInvalidoException;
	Funcionario buscar(String Cpf) throws FuncionarioNaoExisteException;
	void deletar(String Cpf) throws FuncionarioNaoExisteException;
	List<Funcionario> listar();
	void ordenarPorNome();
	void ordenarPorCpf();
	void ordenarPorTipoFuncionario();
}
