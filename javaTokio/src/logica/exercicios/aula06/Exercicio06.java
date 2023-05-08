package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento: ");
		int ano = sc.nextInt();
		int idade = 2023 - ano;
		
		if (idade < 16 || idade > 70) {
			System.out.println("Seu o voto é proibido este ano.");
		}else if (idade >= 16 && idade < 18) {
			System.err.println("Seu o voto é opcional este ano.");
		}else if (idade >= 18 && idade < 70) {
			System.out.println("Seu o voto é obrigatório este ano.");
		}
		sc.close();
	}
}
