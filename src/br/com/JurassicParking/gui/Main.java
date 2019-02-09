package br.com.jurassic_parking.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage estagioPrimario;
	
	
	@Override
	public void start(Stage estagioPrimario) throws IOException {
	this.estagioPrimario = estagioPrimario;
	estagioPrimario.setTitle("Pagina Inicial");
	iniciarRaiz();
	}

	
	public void iniciarRaiz() throws IOException{
		try{
		Parent loader1 =FXMLLoader.load(getClass().getResource("PaginaInicial.fxml"));
		Scene scene = new Scene(loader1);
		estagioPrimario.setMaxHeight(415);
		estagioPrimario.setMaxWidth(616);
		estagioPrimario.setMinHeight(415);
		estagioPrimario.setMinWidth(616);
		estagioPrimario.setScene(scene);
		estagioPrimario.show();
	} catch(IOException e){
		e.getMessage();
	}
	}
	
	public Stage getEstagioPrimario(){
		return estagioPrimario;
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
