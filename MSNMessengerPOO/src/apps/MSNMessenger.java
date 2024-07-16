package apps;

// Herança
public class MSNMessenger extends ServicoMensagemInstantanea{
	// Implementação de métodos abstratos:
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	
}	
