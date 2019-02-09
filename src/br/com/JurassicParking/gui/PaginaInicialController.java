package br.com.jurassic_parking.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PaginaInicialController implements Initializable{

	@FXML
	private Button botaoRelatorio;
	@FXML
	private Button botaoCadastro;
	@FXML
	private Button botaoPagamento;
	@FXML
	private ImageView imageCadastro;
	@FXML
	private ImageView imageRelatorio;
	@FXML
	private ImageView imagePagamento;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	
	@FXML
	public void goToCadastro(ActionEvent event) throws IOException{
	Parent toCadastro = FXMLLoader.load(getClass().getResource("PaginaConta.fxml"));	
	Scene sceneCadastro = new Scene(toCadastro);
	Stage stageCadastro = (Stage) ((Node)event.getSource()).getScene().getWindow();
	stageCadastro.setTitle("Cadastro");
	stageCadastro.setMaxHeight(439);
	stageCadastro.setMaxWidth(400);
	stageCadastro.setMinHeight(439);
	stageCadastro.setMinWidth(400);
	stageCadastro.setScene(sceneCadastro);
	stageCadastro.show();
	}
	
	public void goToRelatorio(ActionEvent event) throws IOException{
		Parent toRelatorio = FXMLLoader.load(getClass().getResource("Relatorios.fxml"));	
		Scene sceneRelatorio = new Scene(toRelatorio);
		Stage stageRelatorio = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stageRelatorio.setTitle("Relatorio");
		stageRelatorio.setMaxHeight(450);
		stageRelatorio.setMaxWidth(700);
		stageRelatorio.setMinHeight(450);
		stageRelatorio.setMinWidth(700);
		stageRelatorio.setScene(sceneRelatorio);
		stageRelatorio.show();
	}
	
	
	public void goToPagamento(ActionEvent event) throws IOException{
		Parent toPagamento = FXMLLoader.load(getClass().getResource("OpcaoPagamento.fxml"));
		Scene scenePagamento = new Scene(toPagamento);
		Stage stagePagamento = (Stage)((Node)event.getSource()).getScene().getWindow();
		stagePagamento.setTitle("Opções Pagamento");
		stagePagamento.setMaxHeight(400);
		stagePagamento.setMinHeight(400);
		stagePagamento.setMaxWidth(409);
		stagePagamento.setMinWidth(409);
		stagePagamento.setScene(scenePagamento);
		stagePagamento.show();
	}
	
	
}
