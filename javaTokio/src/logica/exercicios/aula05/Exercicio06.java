package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Peça 1
		
		System.out.println("Digite o nome da peça 1: ");
		String nome1 = entrada.nextLine();
		
		System.out.println("Digite o número de peças 1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o valor: ");
		double valorPeca1 = entrada.nextDouble(); 	
		
		System.out.println(" ");
		
		//Peça 2
		
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite o nome da peça 2: ");
		String nome2 = entrada1.nextLine();
		
		System.out.println("Digite o número de peças 2: ");
		int numPecas2 = Integer.parseInt(entrada1.nextLine());
		
		System.out.println("Digite o valor: ");
		double valorPeca2 = entrada1.nextDouble();
		
		System.out.println(" ");
		
		double valorFinal =((numPecas1*valorPeca1) + (numPecas2*valorPeca2));
				
		System.out.println("Sua compra ficou no valor de " +valorFinal+ " reais.");
		
		entrada.close();
		entrada1.close();

					

	}

}
