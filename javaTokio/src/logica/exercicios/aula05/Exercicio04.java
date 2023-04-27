package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		Double A = entrada.nextDouble();
		
		System.out.println("Digite o valor B");
		Double B = entrada.nextDouble();
		 
		
		System.out.println("Sua final é: " +(A + B)/2);
		
		entrada.close();
		
		
		 
		 

	}

}
