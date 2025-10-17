package br.edu.fatecpgg.tecprogheranca.model;
import br.edu.fatecpgg.tecprogheranca.model.Veiculo;

public class Carro extends Veiculo {
	private boolean ac;
	private double portaMala;
	
	public Carro(String marca, String modelo, double tanque, int ano, boolean novo, boolean ac, double portaMala) {
		super(marca,modelo,tanque,ano,novo);
		this.ac = ac;
		this.portaMala = portaMala;
	}
	
	public String estacionar() {
		return "Estacionando...Estacionado!";
	}
	
}
