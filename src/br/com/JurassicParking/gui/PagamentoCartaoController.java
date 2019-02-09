package br.com.jurassic_parking.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.jurassic_parking.negocio.CadastroConta;
import br.com.jurassic_parking.negocio.exceptions.ContaNaoExisteException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PagamentoCartaoController implements Initializable{
	
	ObservableList<String> opcoes = FXCollections.observableArrayList("MasterCard", "VISA", "HiperCard", "ELO", "American Express", "DinersClub", "HIPER", "Aura");
	CadastroConta cadastro = CadastroConta.getInstance();

	
	@FXML
	private Button botaoConfirmar;
	@FXML
	private Button botaoCancelar;
	@FXML
	private TextField cpf;
	@FXML
	private TextField numeroCartao;
	@FXML
	private TextField validadeCartao;
	@FXML
	private TextField codigoSeguranca;
	@FXML
	private ChoiceBox cartao;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		cartao.setValue("MasterCard");
		cartao.setItems(opcoes);
	}
	
	@FXML
	public void confirmar(ActionEvent event) throws IOException, ContaNaoExisteException{
		if(cpf.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("CPF EM BRANCO");
            alert.setHeaderText("O CPF não foi preenchido");
            alert.setContentText("Por favor, digite um CPF valido no campo de CPF.");
            alert.showAndWait();
		} else if(numeroCartao.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("NÚMERO DO CARTÃO EM BRANCO");
            alert.setHeaderText("O NÚMERO DO CARTÃO não foi preenchido");
            alert.setContentText("Por favor, digite o Número do Cartão novamente.");
            alert.showAndWait();
		} else if(validadeCartao.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("VALIDADE DO CARTÃO EM BRANCO");
            alert.setHeaderText("A VALIDADE DO CARTÃO não foi preenchida");
            alert.setContentText("Por favor, digite a Validade do Cartão novamente.");
            alert.showAndWait();
		} else if(codigoSeguranca.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("CÓDIGO DE SEGURANÇA EM BRANCO");
            alert.setHeaderText("O CÓDIGO DE SEGURANÇA não foi preenchida");
            alert.setContentText("Por favor, digite o Código do Cartão novamente.");
            alert.showAndWait();
		} else {
			cadastro.procurar(cpf.getText()).getMensalidade().quitarMensalidade();
			
		}
	}
	
	public void cancelar(ActionEvent event) throws IOException{
		
		Parent toOpcaoPagamento = FXMLLoader.load(getClass().getResource("OpcaoPagamento.fxml"));	
		Scene sceneOpcaoPagamento = new Scene(toOpcaoPagamento);
		Stage stageOpcaoPagamento = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stageOpcaoPagamento.setTitle("JURASSIC PARKING");
		stageOpcaoPagamento.setMaxHeight(400);
		stageOpcaoPagamento.setMaxWidth(409);
		stageOpcaoPagamento.setMinHeight(400);
		stageOpcaoPagamento.setMinWidth(409);
		stageOpcaoPagamento.setScene(sceneOpcaoPagamento);
		stageOpcaoPagamento.show();
	
	}
}
