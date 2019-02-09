package br.com.jurassic_parking.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class EditarController implements Initializable{

	ObservableList<String> opcoes = FXCollections.observableArrayList("Nome", "CPF", "Endereco", "");
	
	@FXML
	private TextField opcao1;
	@FXML
	private TextField opcao2;
	@FXML
	private TextField opcao3;
	@FXML
	private TextField opcao4;
	@FXML
	private TextField opcao5;
	@FXML
	private TextField opcao6;
	@FXML
	private ChoiceBox escolha1;
	@FXML
	private ChoiceBox escolha2;
	@FXML
	private ChoiceBox escolha3;
	@FXML
	private DatePicker alterarData;
	@FXML
	private RadioButton genMasc, genFem;
	@FXML 
	private Button botaoConfirmar;
	@FXML 
	private Button botaoRecusar;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		escolha1.setItems(opcoes);
		escolha2.setItems(opcoes);
		escolha3.setItems(opcoes);
		escolha1.setValue("-----");
		escolha2.setValue("-----");
		escolha3.setValue("-----");
	}

	@FXML
	public void votoNulo(ActionEvent event) throws IOException{
	Parent toPaginaInicial = FXMLLoader.load(getClass().getResource("PaginaInicial.fxml"));
	Scene sceneInicial = new Scene(toPaginaInicial);
	Stage stageInicial = (Stage)((Node)event.getSource()).getScene().getWindow();
	stageInicial.setTitle("Pagina Inicial");
	stageInicial.setMaxHeight(430);
	stageInicial.setMaxWidth(620);
	stageInicial.setMinHeight(430);
	stageInicial.setMinWidth(620);
	stageInicial.setScene(sceneInicial);
	stageInicial.show();	
	}
	
}
