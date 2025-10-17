package br.edu.fatecpgg.tecprogheranca.model;

public class Gerente extends Colaborador implements IFuncionario{
	private boolean caixa = false;
	
	public Gerente(String nome, int codigo) {
		super(nome,codigo);
	}
	
	@Override
	public String baterponto() {
		return "Registro realizado";
	}
	
	public boolean iscaixa() {
		return caixa;
	}
	
	public String abrircaixa() {
		if(!this.iscaixa()) {
			this.caixa = true;
			return "caixa aberto";
		}else {
			return "o caixa ja esta aberto"; 
		}
		
	}	
	public String fecharcaixa() {
		if(!this.iscaixa()) {
			this.caixa = false;
			return "caixa fechado";
		}else {
			return "o caixa ja esta fechado"; 
		}
	}
	
}
