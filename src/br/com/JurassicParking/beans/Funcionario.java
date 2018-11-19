package br.com.JurassicParking.beans;

public class Funcionario extends Pessoa {

	private byte tipoFuncionario;
	
	public Funcionario(String nome, String cpf, String email, int RG, int idade, char sexo, byte tipoFuncionario) {
		super(nome, cpf, email, RG, idade, sexo);
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public byte getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(byte tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
		
	public boolean equals(Funcionario outroFuncionario) {
		
		return (this.nome.equals(outroFuncionario.getNome()) && this.cpf.equals(outroFuncionario.getCpf()) && this.email.equals(outroFuncionario.getEmail()) && this.idade == outroFuncionario.getIdade() && this.RG == outroFuncionario.getRG() && this.sexo == outroFuncionario.getSexo() && this.tipoFuncionario == outroFuncionario.getTipoFuncionario());
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", RG=" + RG + ", idade=" + idade
				+ ", sexo=" + sexo + ", tipoFuncionario=" + tipoFuncionario + "]";
	}

}
