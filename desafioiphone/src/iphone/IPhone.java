package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	// ReprodutorMusical:
	public void tocar() {
		System.out.println("Parar música");
	}
	public void pausar() {
		System.out.println("Pausar música");	
	}
	public void selecionarMusica(String musica) {
		System.out.println("Tocar musica: " + musica);
	}
	// AparelhoTelefonico:
	public void ligar(String numero) {
		System.out.println("Chamando " + numero );
	}
	public void atender() {
		System.out.println("Atender chamada");	
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correiro de Voz");	
	}
	// NavegadorInternet:
	public void exibirPagina(String url) {
		System.out.println("Acessando " + url);	
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");	
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página");	
	}
	
}
