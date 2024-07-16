package exemplocontrutores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	
	// método construtor:
	// informações mais importantes para criar uma instância/ um objeto.
	// o nome deverá ser igual ao nome da classe.
	// sem tipo de retorno.
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	// Construtor apenas com o nome:
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	// Construtor sem parâmetro:
	public Pessoa () {
		super();
	}
	
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
	
}
