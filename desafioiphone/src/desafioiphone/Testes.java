package desafioiphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import iphone.IPhone;

public class Testes {
	public static void main(String[] args) {
		IPhone meuIphone = new IPhone();
		
		meuIphone.tocar();
		meuIphone.pausar();
		meuIphone.selecionarMusica("'Refazenda', de Gilberto Gil");
		meuIphone.ligar("+55 11 95555-1234");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		meuIphone.exibirPagina("http://www.google.com.br/");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		
		
		ReprodutorMusical meuTocador = meuIphone;
		System.out.println("Meu tocador:");
		meuTocador.tocar();
		meuTocador.pausar();
		meuTocador.selecionarMusica("'Refazenda', de Gilberto Gil");
		
		
		AparelhoTelefonico meuTelefone = meuIphone;
		System.out.println("Meu telefone:");
		meuTelefone.ligar("+55 11 95555-1234");
		meuTelefone.atender();
		meuTelefone.iniciarCorreioVoz();
		
		
		NavegadorInternet meuNavegador = meuIphone;
		meuNavegador.exibirPagina("http://www.google.com.br/");
		meuNavegador.adicionarNovaAba();
		meuNavegador.atualizarPagina();
		
	}

}
