package br.com.JurassicParking.negocios;

import java.util.List;

import br.com.JurassicParking.beans.Usuario;
import br.com.JurassicParking.negocios.exceptions.UsuarioInvalidoException;
import br.com.JurassicParking.negocios.exceptions.UsuarioJaCadastradoException;
import br.com.JurassicParking.negocios.exceptions.UsuarioNaoExisteException;
import br.com.JurassicParking.repositories.IRepositorioUsuario;
import br.com.JurassicParking.repositories.RepositorioUsuario;

public class NegocioUsuario implements INegocioUsuario {

	private static NegocioUsuario instancia;
	private IRepositorioUsuario Usuario;
	
	private NegocioUsuario() {
		this.Usuario = RepositorioUsuario.getInstance();
	} 
	
	public static synchronized NegocioUsuario getInstance() {
		if(instancia == null) {
			instancia = new NegocioUsuario();
		}
		return instancia;
	}

	@Override
	public void adicionar(Usuario s1) throws UsuarioJaCadastradoException, UsuarioInvalidoException{
		if(s1 != null && s1.getCpf() != null && s1.getEmail() != null && s1.getIdade() != 0 && s1.getNome() != null && s1.getRG() != 0 && (s1.getSexo() == 'M' || s1.getSexo() == 'F' || s1.getSexo() == 'O') && this.Usuario.buscar(s1.getCpf()) == null) {
			this.Usuario.add(s1);
		}else if(s1 == null) {
			throw new UsuarioInvalidoException();
		}else {
			throw new UsuarioJaCadastradoException(s1);
		}
	}

	@Override
	public void editar(String Cpf, Usuario s1) throws UsuarioNaoExisteException, UsuarioInvalidoException {
		if(s1 != null && s1.getCpf() != null && s1.getEmail() != null && s1.getIdade() != 0 && s1.getNome() != null && s1.getRG() != 0 && (s1.getSexo() == 'M' || s1.getSexo() == 'F' || s1.getSexo() == 'O') && this.Usuario.buscar(Cpf) != null) {
			this.Usuario.update(Cpf, s1);
		}else if(s1 == null) {
			throw new UsuarioInvalidoException();
		}else {
			throw new UsuarioNaoExisteException();
		}
		
	}

	@Override
	public Usuario buscar(String placa) throws UsuarioNaoExisteException {
		if(this.Usuario.buscar(placa) != null) {
			return this.Usuario.buscar(placa);
		}else {
			throw new UsuarioNaoExisteException();
		}	
	}

	@Override
	public void deletar(String placa) throws UsuarioNaoExisteException {
		if(this.Usuario.buscar(placa) != null) {
			this.Usuario.delete(placa);
		}else {
			throw new UsuarioNaoExisteException();
		}
	}

	@Override
	public List<Usuario> listar() {
		return this.Usuario.listar();
	}	
		
	public void ordenarPorNome() {
		this.Usuario.ordenarPorNome();
	}
	
	public void ordenarPorCpf() {
		this.Usuario.ordenarPorCpf();
	}
	
	public void ordenarPorTipoUsuario() {
		this.Usuario.ordenarPorTipoUsuario();
	}
}
