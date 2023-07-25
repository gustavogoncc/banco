public class Pessoa {
	private  static int counter  =1;
	
	private String nome;
	private String CPF;
	private String email;
	
	// Método Construtor
	public Pessoa(String nome, String CPF, String email) {
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		counter +=1;
	}
	
	//  Definição dos Getters e Setters 
	private String getNome() {
		return nome;
	}
	private String getCPF() {
		return CPF;
	}
	private String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "\nNome:" + this.getNome()+
				"\nCPF:" + this.getCPF()+
				"\nEmail:" + this.getEmail();
	}
}
