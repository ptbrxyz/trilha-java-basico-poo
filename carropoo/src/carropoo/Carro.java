package carropoo;

public class Carro extends Veiculo{
	
	// Encapsulamento:
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {
		System.out.println("conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("conferindo câmbio");
	}
}
