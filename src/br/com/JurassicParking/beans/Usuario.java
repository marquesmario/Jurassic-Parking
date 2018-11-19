package br.com.JurassicParking.beans;

public class Usuario extends Pessoa {

	private byte tipoUsuario;
	
	public Usuario(String nome, String cpf, String email, int RG, int idade, char sexo, byte tipoUsuario) {
		super(nome, cpf, email, RG, idade, sexo);
		this.tipoUsuario = tipoUsuario;
	}

	public byte getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(byte tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
		
	public boolean equals(Usuario outroUsuario) {
		
		return (this.nome.equals(outroUsuario.getNome()) && this.cpf.equals(outroUsuario.getCpf()) && this.email.equals(outroUsuario.getEmail()) && this.idade == outroUsuario.getIdade() && this.RG == outroUsuario.getRG() && this.sexo == outroUsuario.getSexo() && this.tipoUsuario == outroUsuario.getTipoUsuario());
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RG=" + RG + ", idade=" + idade
				+ ", sexo=" + sexo + ", tipoUsuario=" + tipoUsuario + "]";
	}
}
