package br.edu.fatecpgg.tecprogheranca.view;
import br.edu.fatecpgg.tecprogheranca.model.Veiculo;
import br.edu.fatecpgg.tecprogheranca.model.Carro;
import br.edu.fatecpgg.tecprogheranca.model.Gerente;

public class Main {
	
	public static void main(String[] args) {
		/*Veiculo veiculo = new Veiculo("fiat","moby",50,2024,false);
		
		Carro carro = new Carro("Renault","Logan",54,2020,false,true,400);
		
		System.out.println(veiculo.abastecer(52));
		System.out.println(carro.abastecer(25));
		System.out.println(carro.estacionar());*/
		
		Gerente ger = new Gerente("Ale",10);
		
		System.out.println(ger.abrircaixa());
		System.out.println(ger.baterponto());
	}
}
