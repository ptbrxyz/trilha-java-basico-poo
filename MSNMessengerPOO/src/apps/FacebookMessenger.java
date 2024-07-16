package apps;

//Herança
public class FacebookMessenger extends ServicoMensagemInstantanea {
	// Implementação de métodos abstratos:
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
