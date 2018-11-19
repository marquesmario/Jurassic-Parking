package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Usuario;
import br.com.JurassicParking.negocios.exceptions.UsuarioInvalidoException;
import br.com.JurassicParking.negocios.exceptions.UsuarioJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.UsuarioNaoExisteException;

public interface INegocioUsuario {
	
	void adicionar(Usuario s1) throws UsuarioJaCadastradoException, UsuarioInvalidoException;
	void editar(String Cpf, Usuario s1) throws UsuarioNaoExisteException, UsuarioInvalidoException;
	Usuario buscar(String Cpf) throws UsuarioNaoExisteException;
	void deletar(String Cpf) throws UsuarioNaoExisteException;
	List<Usuario> listar();
	void ordenarPorNome();
	void ordenarPorCpf();
	void ordenarPorTipoUsuario();

}
