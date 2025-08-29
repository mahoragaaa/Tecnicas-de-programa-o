package br.edu.fatecpg.progabstracao.view;
import br.edu.fatecpg.progabstracao.model.Carro;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Carro meuCarro = new Carro();
		meuCarro.capacidade_tanque = "2l";
		meuCarro.modelo = "fusca";
		meuCarro.cor = "azul";
		meuCarro.ano = 2006;
		
		System.out.println("Ano do " + meuCarro.modelo + " " + meuCarro.cor + ": " + meuCarro.ano);
		
		Carro optimusPrime = new Carro();
		optimusPrime.ano = 1984;
		
		System.out.println("Ano do Optimus Prime é: " + optimusPrime.ano);
		optimusPrime.desligar();
		optimusPrime.acelerar();
		optimusPrime.buzinar();
		optimusPrime.ligar();
		optimusPrime.buzinar();
		
	}

}
