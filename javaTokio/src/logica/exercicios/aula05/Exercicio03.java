package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Seelecione seu gênero");
		System.out.println("[M] - masculino");
		System.out.println("[F] - feminino");
		System.out.println("[O] - outro");
		System.out.println("[N] - não responder");
		
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Olá," +nome+ "“Você escolheu a seguinte opção de gênero: " +genero);
		
		entrada.close();


	}

}
