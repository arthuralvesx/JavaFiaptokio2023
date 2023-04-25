package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite o mes em que você nasceu: ");
		int meses = entrada.nextInt();
		
		System.out.println("Digite o dia em que você nasceu: ");
		int dia = entrada.nextInt();
		
		int diasVivido = (idade * 365) + meses * 30 + dia;
		
		System.out.println("Você viveu " +diasVivido+ " dias");
		
	}

}
