package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo de estado (1 a 5)");
		int estado = sc.nextInt();
		
		System.out.println("Digite a quantidade de toneladas");
		double carga = sc.nextDouble();
		
		System.out.println("Digite o codigo da carga (10 a 40)");
		int codigo = sc.nextInt();
				
		
		double cargaK = carga * 1000;
		System.out.println("Peso da carga em quilos: " +cargaK );
		 
		
		//Calcular o preco da carga por kilos
		double precoCarga, imposto = 0;
		
		if(codigo >= 10 || codigo <= 20) {
			precoCarga = cargaK * 100;
		} else if (codigo >= 21 || codigo <= 30) {
			precoCarga = cargaK * 250;
		} else {
			precoCarga = cargaK * 340;
		}
		System.out.printf("Preço da carga pelo codigo de carga: " +precoCarga);
		System.out.println(" ");
		
		
		//Imposto
		//Aplicando o valor da carga com o imposto por estado
		
		switch (estado) {
			case 1:
				imposto = precoCarga * 0.35;
				System.out.printf("Preco da carga com imposto: " +imposto);
				System.out.println(" ");
				break;
			case 2:
				imposto = precoCarga * 0.25;
				System.out.printf("Preco da carga com imposto: " +imposto);
				System.out.println(" ");
				break;
			case 3:
				imposto = precoCarga * 0.15;
				System.out.printf("Preco da carga com imposto: " +imposto);
				System.out.println(" ");
				break;
			case 4:
				imposto = precoCarga * 0.05;
				System.out.printf("Preco da carga com imposto: " +imposto);
				System.out.println(" ");
			case 5:
				imposto = precoCarga * 0;
				System.out.printf("Preco da carga com imposto: " +imposto);
				System.out.println(" ");
			default:
				System.out.println("Digito invalido");
				System.out.println(" ");
		}
		
		double total = precoCarga + imposto;
		System.out.printf("Total %.2f",total);
		
	}

}

