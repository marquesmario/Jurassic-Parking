package br.com.jurassic_parking.gui;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import br.com.jurassic_parking.negocio.CadastroConta;
import br.com.jurassic_parking.negocio.CadastroVaga;
import br.com.jurassic_parking.negocio.beans.Conta;
import br.com.jurassic_parking.negocio.beans.Pessoa;
import br.com.jurassic_parking.negocio.beans.Veiculo;
import br.com.jurassic_parking.negocio.exceptions.ContaJaExisteException;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

public class CadastrarMensalistaController implements Initializable {

	@FXML 
	private Button botaoCancelar;
	@FXML 
	private Button botaoSalvar;
	@FXML
	private TextField escreverNome;
	@FXML
	private TextField escreverEndereco;
	@FXML
	private TextField escreverCPF;
	@FXML
	private TextField escreverGenero;
	@FXML
	private DatePicker dataNascimento;
	@FXML
	private TextField escreverModelo;
	@FXML
	private TextField escreverPlaca;
	@FXML
	private TextField escreverVaga;
	@FXML
	private RadioButton mensal, diaria;
	private Pessoa pessoa;
	private Veiculo veiculo;
	private Conta conta;
	private CadastroConta cadastroConta = CadastroConta.getInstance();
	private CadastroVaga vaga = CadastroVaga.getInstance();
	
	@FXML
	public void salvarCliente(ActionEvent event) throws IOException{
		if(escreverNome.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("NOME EM BRANCO");
            alert.setHeaderText("O NOME não foi preenchido");
            alert.setContentText("Por favor, Digite um Nome valido no campo de Nome.");
            alert.showAndWait();
		}
		else if(escreverEndereco.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("ENDERECO EM BRANCO");
            alert.setHeaderText("O ENDERECO não foi preenchido");
            alert.setContentText("Por favor, Digite um Endereco valido no campo de Endereco.");
            alert.showAndWait();
		}
		else if(escreverCPF.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("CPF EM BRANCO");
            alert.setHeaderText("O CPF não foi preenchido");
            alert.setContentText("Por favor, Digite um CPF valido no campo de CPF.");
            alert.showAndWait();
		}
		else if(dataNascimento.getValue().isAfter(LocalDate.now())){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("DATA INCORRETA");
            alert.setHeaderText("A DATA está incorreta");
            alert.setContentText("Por favor, Digite uma DATA valida.");
            alert.showAndWait();
		}
		else if(escreverGenero.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Genero EM BRANCO");
            alert.setHeaderText("O Genero não foi preenchido");
            alert.setContentText("Por favor, Digite um Genero valido.");
            alert.showAndWait();
		}
		else if(escreverModelo.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Modelo EM BRANCO");
            alert.setHeaderText("O Modelo não foi preenchido");
            alert.setContentText("Por favor, Digite um Modelo valido.");
            alert.showAndWait();
		}
		else if(escreverPlaca.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Placa EM BRANCO");
            alert.setHeaderText("A Placa não foi preenchido");
            alert.setContentText("Por favor, Digite uma Placa valida.");
            alert.showAndWait();
		}
		else if(escreverVaga.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Vaga EM BRANCO");
            alert.setHeaderText("A Vaga não foi preenchido");
            alert.setContentText("Por favor, Digite uma Vaga valida.");
            alert.showAndWait();
		}else{
			this.pessoa = new Pessoa(escreverNome.getText(), escreverGenero.getText().charAt(0), escreverEndereco.getText(), escreverCPF.getText(), dataNascimento.getValue() );
			this.veiculo = new Veiculo(escreverModelo.getText(), escreverPlaca.getText());
			int numeroDaVaga = Integer.parseInt(escreverVaga.getText());
			this.conta = new Conta(pessoa, veiculo, vaga.getVaga(numeroDaVaga), false);
			try {
				cadastroConta.cadastrarConta(conta);
			} catch (ContaJaExisteException e) {
				e.getMessage();
			}
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}


	@FXML
	public void cancelarAcao(ActionEvent event) throws IOException{
	Parent backToConta = FXMLLoader.load(getClass().getResource("PaginaConta.fxml"));
	Scene sceneBack = new Scene(backToConta);
	Stage stageBack = (Stage)((Node)event.getSource()).getScene().getWindow();
	stageBack.setTitle("Cadastro");
	stageBack.setMaxHeight(470);
	stageBack.setMaxWidth(720);
	stageBack.setMinHeight(470);
	stageBack.setMinWidth(720);
	stageBack.setScene(sceneBack);
	stageBack.show();
	}
	

}
