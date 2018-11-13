package br.com.JurassicParking.beans;

public class Vaga {
	
	private int id;
	private String local;
	private byte tipoVaga;
	private boolean livre;
	private Veiculo veiculo;
	
	public Vaga(int id, String local, byte tipoVaga) {
		this.id = id;
		this.local = local;
		this.tipoVaga = tipoVaga;
		this.livre = true;
		this.veiculo = null;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public byte getTipoVaga() {
		return tipoVaga;
	}


	public void setTipoVaga(byte tipoVaga) {
		this.tipoVaga = tipoVaga;
	}


	public boolean isLivre() {
		return livre;
	}


	public void setLivre(boolean livre) {
		this.livre = livre;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public boolean ocupar(Veiculo veiculo) {
		boolean retorno;
		
		if(this.livre == true) {
			this.veiculo = veiculo;
			this.livre = false;
			retorno =  true;
		}else {
			retorno = false;
		}
		
		return retorno;
	}
	
	public void desocuparVaga() {
		this.livre = true;
		this.veiculo = null;
	}
	
	public boolean equals(Vaga outraVaga) {	
		return (this.id == outraVaga.getId() && this.local.equals(outraVaga.getLocal()) && this.veiculo.equals(outraVaga.getVeiculo()) && this.tipoVaga == outraVaga.getTipoVaga() && this.livre == outraVaga.isLivre());
	}


	@Override
	public String toString() {
		return "Vaga [id=" + id + ", local=" + local + ", tipoVaga=" + tipoVaga + ", livre=" + livre + ", veiculo="
				+ veiculo + "]";
	}
}
