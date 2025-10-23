package br.edu.fatecpgg.tecprogheranca.model;

public class Sistemdeseguranca implements IAutenticavel{
	
	public Sistemdeseguranca(String usuario, int senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.login = -1;
	}

	private int senha;
	private String usuario;
	private int login;
	
	
	
	public int Login(String usuario, int senha) {
		if(this.senha == senha && this.usuario == usuario) {
			login = 1;
			System.out.println("vocẽ está logado");
			return 1;
		}else {
			System.out.println("senha ou usuario incorreto");
			System.out.println(this.senha + this.usuario);
			return -1;
		}
	}
	
	public String Logout(){
		if(this.login == 1) {
			this.login = -1;
			return "Deslogado!";
		} else {
			return "Vocẽ ja está deslogado";
		}
	}
}
