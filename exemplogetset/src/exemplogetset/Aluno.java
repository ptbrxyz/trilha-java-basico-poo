package exemplogetset;

//arquivo Aluno.java
public class Aluno {
	private String nome;
	private int idade;
	
	private String sexo;
	
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/*
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		//this.nome = nome;
		nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
	
	*/
}

