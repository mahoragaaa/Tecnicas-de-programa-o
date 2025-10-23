package br.edu.fatecpgg.tecprogheranca.model;

public class Pagamentodinheiro implements IPagamento {
	public double saldo;
	public double divida;
	
	public Pagamentodinheiro(double d, double e) {
		this.saldo = d;
		this.divida = e;
	}
	
	public java.lang.Integer calcularpagamento() {
		if(this.saldo >= this.divida ) {
			this.divida += this.divida * 0.05;
			this.saldo -= this.divida;
			this.divida -= 0.00;
			emitirrecibo(this.saldo, 0.00);
			return null;
		}else {
			System.out.println("Saldo isnuficiente!!");
			return null;
		}
		
		
	}
	public java.lang.Integer emitirrecibo(double saldo, double divida) {
		System.out.println("Pagamento efetuado com dinhiero desconto de 10% inserido! \na divida atual é: " + divida + " e o saldo atual é: " + saldo);
		return null;
	}
}
