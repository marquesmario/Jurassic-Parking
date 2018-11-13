package br.com.JurassicParking.beans;

import br.com.JurassicParking.repositories.RepositorioVeiculo;

public class main {

	public static void main(String[] args) {
		
		Veiculo veiculo1 =  new Veiculo("ce38js", "fiat", "palio", 1999, "azul", (byte) 1);
		Veiculo veiculo2 =  new Veiculo("klb9483", "Renault", "Citroen", 2013, "Verde", (byte) 3);
		Veiculo veiculo3 =  new Veiculo("kss3849", "Jeep", "Jeep", 2016, "Cinza", (byte) 2);
		
		Servico servico1 = new Servico(0,"Lavagem de carro", 23.45, (byte) 3);
		Usuario usuario1 = new Usuario("Mario", "110.109.944-50", "mario_marques185@hotmail.com", 22, 9165364,'M' ,(byte) 2);
		Vaga vaga1 = new Vaga(0, "3° vaga do 3° andar", (byte) 1);
		
		System.out.println(veiculo1);
		System.out.println(vaga1);
		vaga1.ocupar(veiculo1);
		System.out.println(vaga1);
		vaga1.desocuparVaga();
		System.out.println(vaga1);
		System.out.println(servico1);
		System.out.println(usuario1);
		
		RepositorioVeiculo listaVeiculo = RepositorioVeiculo.getInstancia();
		
		listaVeiculo.add(veiculo1);
		listaVeiculo.add(veiculo2);
		listaVeiculo.add(veiculo3);
		System.out.println(listaVeiculo.buscar("ce38js"));
		System.out.println(listaVeiculo.listar());
		
	}
}
