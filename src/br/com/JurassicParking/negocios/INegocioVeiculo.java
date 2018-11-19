package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Veiculo;
import br.com.JurassicParking.negocios.exceptions.VeiculoInvalidoException;
import br.com.JurassicParking.negocios.exceptions.VeiculoJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.VeiculoNaoExisteException;

public interface INegocioVeiculo {

	void adicionar(Veiculo s1) throws VeiculoJaCadastradoException, VeiculoInvalidoException;
	void editar(String Placa, Veiculo s1) throws VeiculoNaoExisteException, VeiculoInvalidoException;
	Veiculo buscar(String Placa) throws VeiculoNaoExisteException;
	void deletar(String Placa) throws VeiculoNaoExisteException;
	List<Veiculo> listar();
	void ordenarPorPlaca();
	void ordenarPorTipoVeiculo();
	
}
