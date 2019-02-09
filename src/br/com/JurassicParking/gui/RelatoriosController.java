package br.com.jurassic_parking.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class RelatoriosController implements Initializable {

	@FXML
	private CheckBox relatorioMensalistas;
	@FXML
	private CheckBox relatorioDiaristas;
	@FXML
	private CheckBox relatorioVagasLivres;
	@FXML
	private CheckBox relatorioVagasOcupadas;
	@FXML
	private CheckBox relatorioEntSaida;
	@FXML
	private Button gerarRelatorio;
	@FXML
	private Button salvarRelatorio;
	@FXML
	private Button cancelarRelatorio;
	@FXML
	private Label mensagemError;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
