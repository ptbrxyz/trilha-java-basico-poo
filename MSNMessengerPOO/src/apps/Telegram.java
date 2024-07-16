package apps;

//Herança
public class Telegram extends ServicoMensagemInstantanea {
	// Implementação de métodos abstratos:

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
