package br.com.jurassic_parking.gui;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class PaginaContaController implements Initializable{

	
	@FXML
	private Button botaoCadastrarM;
	@FXML
	private Button botaoEditar;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	@FXML 
	public void cadastrarM(ActionEvent event) throws IOException {
	Parent toCadastrarM = FXMLLoader.load(getClass().getResource("CadastrarMensalista.fxml"));
	Scene sceneCadastrarM = new Scene(toCadastrarM);
	Stage stageCadastrarM = (Stage)((Node)event.getSource()).getScene().getWindow();
	stageCadastrarM.setTitle("Cadastrar Mensalista");
	stageCadastrarM.setMaxHeight(430);
	stageCadastrarM.setMinHeight(430);
	stageCadastrarM.setMaxWidth(450);
	stageCadastrarM.setMinWidth(450);
	stageCadastrarM.setScene(sceneCadastrarM);
	stageCadastrarM.show();
	}	
	
	@FXML
	public void editarCliente(ActionEvent event) throws IOException{
		Parent toEdit = FXMLLoader.load(getClass().getResource("ProcurarConta.fxml"));
		Scene sceneEdit = new Scene(toEdit);
		Stage stageEdit = (Stage)((Node)event.getSource()).getScene().getWindow();
		stageEdit.setTitle("Localizador de Contas");
		stageEdit.setMaxHeight(430);
		stageEdit.setMinHeight(430);
		stageEdit.setMaxWidth(450);
		stageEdit.setMinWidth(450);
		stageEdit.setScene(sceneEdit);
		stageEdit.show();
	}
	
	
	@FXML
	public void voltar(ActionEvent event) throws IOException{
		Parent toPaginaInicial = FXMLLoader.load(getClass().getResource("PaginaInicial.fxml"));
		Scene sceneInicial = new Scene(toPaginaInicial);
		Stage stageInicial = (Stage)((Node)event.getSource()).getScene().getWindow();
		stageInicial.setTitle("Pagina Inicial");
		stageInicial.setMaxHeight(415);
		stageInicial.setMaxWidth(616);
		stageInicial.setMinHeight(415);
		stageInicial.setMinWidth(616);
		stageInicial.setScene(sceneInicial);
		stageInicial.show();
	}
}
