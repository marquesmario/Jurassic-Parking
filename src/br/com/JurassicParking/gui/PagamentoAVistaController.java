package br.com.jurassic_parking.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.jurassic_parking.negocio.CadastroConta;
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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PagamentoAVistaController implements Initializable {
	CadastroConta cadastro = CadastroConta.getInstance();

	
	@FXML
	private Button botaoConfirmar;
	@FXML
	private Button botaoCancelar;
	@FXML
	private TextField cpf;
	@FXML
	private TextField valorDebitado;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
	}
	
	@FXML
	public void confirmar(ActionEvent event) throws IOException, ContaNaoExisteException{
		if(cpf.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("CPF EM BRANCO");
            alert.setHeaderText("O CPF não foi preenchido");
            alert.setContentText("Por favor, digite um CPF valido no campo de CPF.");
            alert.showAndWait();
		} else if(valorDebitado.getText().equals("")){
			Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("VALOR DEBITADO NÃO INFORMADO");
            alert.setHeaderText("O VALOR DEBITADO não foi preenchido");
            alert.setContentText("Por favor, digite o Valor Debitado novamente.");
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
