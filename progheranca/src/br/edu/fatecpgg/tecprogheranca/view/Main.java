package br.edu.fatecpgg.tecprogheranca.view;
import br.edu.fatecpgg.tecprogheranca.model.*;
import java.util.Scanner;

public class Main {
	
		private static String usuario;
		private static int senha;

		public static void main(String[] args) {
			int a = 2; 
			Scanner scan = new Scanner(System.in);
			
			do {
				System.out.println("qual excercio vocẽ quer ver?");
				int resposta = scan.nextInt();
				switch(resposta) {
				case 1 :
					calculadora();
				break;
				
				case 2 :
					pagar();
				break;
				
				case 3 :
					logar();
				break;
				
				default :
					System.out.println("esse execercio não existe");
				}
			} while( a == 2);
	
			
			
		}
		
		public  static java.lang.Integer pagar() {
			Pagamentocartao conta = new Pagamentocartao(100.00,50.00);
			Pagamentodinheiro contadin = new Pagamentodinheiro(100.00,50.00);
			System.out.println(conta.calcularpagamento());
			System.out.println(contadin.calcularpagamento());
			return null;
		}
		
		public static java.lang.Integer logar() {
			Scanner scan = new Scanner(System.in);
			Sistemdeseguranca jorge = new Sistemdeseguranca("admin",1234); 
			
			System.out.println("insira seu nome de usuario: ");
			String usuario = scan.nextLine();
			System.out.println("insira sua senha para logar: ");
			int senha = scan.nextInt();

			if(jorge.Login(usuario,senha) == -1) {
				System.out.println(usuario + senha);
				logar();
				return null;
			}else {
			System.out.println(jorge.Login(usuario,senha));
			return null;
			}
		}
		
		public static java.lang.Integer calculadora() {
			
			Calculadora result = new Calculadora();
			System.out.println(result.soma(1,5));
			System.out.println(result.subtracao(1,5));
			System.out.println(result.divisao(10,5));
			System.out.println(result.multiplicacao(2,5));
			return null;
			
		}
}
