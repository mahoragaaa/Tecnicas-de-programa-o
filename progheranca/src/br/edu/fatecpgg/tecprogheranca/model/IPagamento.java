package br.edu.fatecpgg.tecprogheranca.model;

public interface IPagamento {
	public java.lang.Integer emitirrecibo(double saldo, double divida);
	public java.lang.Integer calcularpagamento();
}
