package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: " );
				
		int num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("O número " +num+ " é impar.");		
		}else {
			System.out.println("O número " +num+ " é par.");
			sc.close();
		}

	}

}
