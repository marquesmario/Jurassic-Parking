package br.com.jurassic_parking.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.jurassic_parking.negocio.CadastroConta;
import br.com.jurassic_parking.negocio.CadastroVaga;
import br.com.jurassic_parking.negocio.exceptions.ContaNaoExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ProcurarContaController implements Initializable {

	private CadastroVaga teste1;
	private CadastroConta teste;
	@FXML
	private TextField escreverCPF;
	@FXML
	private RadioButton rbDeletar;
	@FXML
	private RadioButton rbEdit;
	@FXML
	private RadioButton rbLiberar;
	@FXML
	private Label loginInexistente;
	@FXML
	private Button botaoConfirmar;
	@FXML
	private Button botaoCancelar;
	
	@FXML
	public void confirmarAcao(ActionEvent event) throws IOException, ContaNaoExisteException{
		teste1 = CadastroVaga.getInstance();
		teste = CadastroConta.getInstance();
		
	if(escreverCPF.getText().equals("")){
		Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("CPF EM BRANCO");
        alert.setHeaderText("O CPF não foi preenchido");
        alert.setContentText("Por favor, Digite um CPF valido no campo de CPF.");
        alert.showAndWait();
		
	}else if(rbEdit.isArmed() && teste.existeConta(escreverCPF.getText()) == true){
			Parent toEdit = FXMLLoader.load(getClass().getResource("Editar.fxml"));
			Scene sceneEdit = new Scene(toEdit);
			Stage stageToEdit = (Stage)((Node)event.getSource()).getScene().getWindow();
			stageToEdit.setTitle("Editar Usuario");
			stageToEdit.setScene(sceneEdit);
			stageToEdit.show();
			
		}else if(rbLiberar.isArmed() && teste.existeConta(escreverCPF.getText()) == true){
			teste1.liberarVaga(teste.procurar(escreverCPF.getText()).getVaga().getNumber());
		}
		else{
			teste.removerConta(teste.procurar(escreverCPF.getText()));
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
