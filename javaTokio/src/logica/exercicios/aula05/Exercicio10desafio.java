package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos dia você já viveu: ");
		int diasVividos = entrada.nextInt();
		
		int anos = diasVividos / 365;
		int restoDias = diasVividos % 365;
		int mes = restoDias / 30;
		int dias = restoDias % 30;
		
		System.out.printf("Você tem " +anos+ " anos de idade \n"+mes+ " meses de vida\n" +dias+ " dias de vida");
		
		entrada.close();
	}

}
