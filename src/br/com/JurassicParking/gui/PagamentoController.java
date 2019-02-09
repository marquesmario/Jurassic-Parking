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
import javafx.stage.Stage;

public class PagamentoController implements Initializable{

	@FXML
	private Button botaoCartao;
	@FXML
	private Button botaoAVista;
	@FXML
	private Button botaoCancelar;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		
	}
	@FXML
	public void goToPagamentoAVista(ActionEvent event) throws IOException{
		Parent toPagamentoAVista = FXMLLoader.load(getClass().getResource("PagamentoAVista.fxml"));	
		Scene scenePagamentoAVista = new Scene(toPagamentoAVista);
		Stage stagePagamentoAVista = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stagePagamentoAVista.setTitle("JURASSIC PARKING: Pagamento (A Vista)");
		stagePagamentoAVista.setMaxHeight(360);
		stagePagamentoAVista.setMaxWidth(377);
		stagePagamentoAVista.setMinHeight(360);
		stagePagamentoAVista.setMinWidth(347);
		stagePagamentoAVista.setScene(scenePagamentoAVista);
		stagePagamentoAVista.show();
	
	}
	
	
	public void goToPagamentoCartao(ActionEvent event) throws IOException{
		Parent toPagamentoCartao = FXMLLoader.load(getClass().getResource("PagamentoCartao.fxml"));	
		Scene scenePagamentoCartao = new Scene(toPagamentoCartao);
		Stage stagePagamentoCartao = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stagePagamentoCartao.setTitle("JURASSIC PARKING: Pagamento (Cartão)");
		stagePagamentoCartao.setMaxHeight(419);
		stagePagamentoCartao.setMaxWidth(437);
		stagePagamentoCartao.setMinHeight(419);
		stagePagamentoCartao.setMinWidth(437);
		stagePagamentoCartao.setScene(scenePagamentoCartao);
		stagePagamentoCartao.show();
	}
	
	
	public void cancelar(ActionEvent event) throws IOException{
		
		Parent toPaginaInicial = FXMLLoader.load(getClass().getResource("PaginaInicial.fxml"));	
		Scene scenePaginaInicial = new Scene(toPaginaInicial);
		Stage stagePaginaInicial = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stagePaginaInicial.setTitle("JURASSIC PARKING");
		stagePaginaInicial.setMaxHeight(415);
		stagePaginaInicial.setMaxWidth(616);
		stagePaginaInicial.setMinHeight(415);
		stagePaginaInicial.setMinWidth(616);
		stagePaginaInicial.setScene(scenePaginaInicial);
		stagePaginaInicial.show();
	
	}
		
}
