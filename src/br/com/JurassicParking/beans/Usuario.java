package br.com.JurassicParking.beans;

public class Usuario {

	private String nome;
	private String cpf;
	private String email;
	private int RG;
	private int idade;
	private char sexo;
	private byte tipoUsuario;
	
	public Usuario(String nome, String cpf, String email, int RG, int idade, char sexo, byte tipoUsuario){
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.RG = RG;
		this.idade = idade;
		this.sexo = sexo;
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
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
