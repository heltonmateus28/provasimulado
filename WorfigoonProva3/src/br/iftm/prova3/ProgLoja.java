package br.iftm.prova3;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProgLoja extends Application implements EventHandler{

	Button btnCadastro, btnListagem, btnExclui, btnAtualiza, btnCadastrar, btnBuscarPorString, btnBuscarPorId;

	public static void main(String[] args) {
		
	
				launch();
				
				

			}

	@Override
	public void handle(Event evento) {
		if(evento.getSource().equals(btnCadastro)){
			cadastrar();
		}else if(evento.getSource().equals(btnAtualiza)){
			atualiza();
		}else{
			exclui();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void cadastrar(){
		VBox raiz = new VBox(10); 
		raiz.setAlignment(Pos.CENTER);
		
		Label lblNome = new Label("Nome: ");
		TextField nome = new TextField("Informe o nome"); 
		nome.setTooltip(new Tooltip(
				"Por favor, informe seu nome."));
		
		Label lblPreco = new Label("Preço: ");
		TextField preco = new TextField("Informe o preço"); 
		nome.setTooltip(new Tooltip(
				"Por favor, informe o preço."));
		
		Label msg = new Label(); 
		
		btnCadastrar = new Button("Cadastrar");
		btnCadastrar.setOnAction(new EventHandler() {

			@Override
			public void handle(Event evento) {
				Livro cliente = new Livro(nome.getText(), Integer.parseInt(preco.getText()));
				cliente.cadastra(cliente);
				msg.setStyle("-fx-background-color: green;");
				msg.setText("Cliente cadastrado com sucesso!");
				nome.clear();
				preco.clear();
			}
		});
		
		raiz.getChildren().addAll(msg,lblNome, nome, lblPreco,preco, btnCadastrar);
		
		Scene cena = new Scene(raiz, 400, 300);
		Stage palco = new Stage();
		palco.setTitle("Cadastro");
		palco.setScene(cena);
		palco.show();
	}
	
	@SuppressWarnings("unchecked")
	public void atualiza(){
		VBox raiz = new VBox(10); 
		raiz.setAlignment(Pos.CENTER);
		
		Label lblAtualiza = new Label("Id: ");
		TextField atualiza = new TextField("Informe o id"); 
		atualiza.setTooltip(new Tooltip(
				"Por favor, informe o id."));
		
		Label lblNome = new Label("Nome: ");
		TextField nome = new TextField("Informe o novo nome"); 
		atualiza.setTooltip(new Tooltip(
				"Por favor, informe o novo nome."));
		
		Label lblPreco = new Label("Preço: ");
		TextField preco = new TextField("Informe o novo Preço"); 
		atualiza.setTooltip(new Tooltip(
				"Por favor, informe o novo preço."));
		
		Label msg = new Label(); 
		
		btnAtualiza = new Button("Atualizar");
		btnAtualiza.setOnAction(new EventHandler() {

			@Override
			public void handle(Event evento) {
				int id = Integer.parseInt(atualiza.getText());
				String l1 = nome.getText();
				String l2 = preco.getText();
				Livro liv = new Livro();
				liv.atualiza(id,l1,l2);
				msg.setStyle("-fx-background-color: green;");
				msg.setText("Cliente atualizado com sucesso!");
				atualiza.clear();
			}
		});
		
		raiz.getChildren().addAll(msg, atualiza,lblNome,nome,lblPreco, preco, btnAtualiza);
		
		Scene cena = new Scene(raiz, 400, 300);
		Stage palco = new Stage();
		palco.setTitle("Cadastro");
		palco.setScene(cena);
		palco.show();
	}
	
	@SuppressWarnings("unchecked")
	public void exclui(){
		VBox raiz = new VBox(10); 
		raiz.setAlignment(Pos.CENTER);
		
		Label lblExclui = new Label("Id: ");
		TextField exclui = new TextField("Informe o id"); 
		exclui.setTooltip(new Tooltip(
				"Por favor, informe o id."));
		
		Label msg = new Label(); 
		
		btnExclui = new Button("Excluir");
		btnExclui.setOnAction(new EventHandler() {

			@Override
			public void handle(Event evento) {
				int id = Integer.parseInt(exclui.getText());
				Livro l1 = new Livro();
				l1.exclui(id);
				msg.setStyle("-fx-background-color: green;");
				msg.setText("Cliente excluído com sucesso!");
				exclui.clear();
			}
		});
		
		raiz.getChildren().addAll(msg, lblExclui,exclui, btnExclui);
		
		Scene cena = new Scene(raiz, 400, 300);
		Stage palco = new Stage();
		palco.setTitle("Cadastro");
		palco.setScene(cena);
		palco.show();
	}

	@Override
	public void start(Stage palco) throws Exception {

		HBox raiz = new HBox(10); 
		//Todos os componentes serÃ£o posicionados no centro da raiz
		raiz.setAlignment(Pos.CENTER); 
		
		btnCadastro = new Button("Cadastrar");
		btnAtualiza = new Button("Atualizar");
		btnExclui = new Button("Excluir");
		//btnAtualiza = new Button("Atualizar");
		
		btnCadastro.setOnAction(this);
		btnAtualiza.setOnAction(this);
		btnExclui.setOnAction(this);
		//btnAtualiza.setOnAction(this);
		
		raiz.getChildren().addAll(btnCadastro, btnAtualiza, btnExclui);
		
		Scene cena = new Scene(raiz, 250, 100);
		// Adicionamos um tÃ­tulo
		palco.setTitle("JavaFX + Hibernate");
		// Setamos a container no palco
		palco.setScene(cena);
		// Mostramos o palco
		palco.show();
	}
		
	}

		


	


