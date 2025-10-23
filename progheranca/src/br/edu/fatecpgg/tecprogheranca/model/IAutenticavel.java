package br.edu.fatecpgg.tecprogheranca.model;

public interface IAutenticavel {
	
	public int Login(String Usuario, int senha);
	public String Logout();
}
