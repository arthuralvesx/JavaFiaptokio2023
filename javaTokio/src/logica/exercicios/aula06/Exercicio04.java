package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numA = 10;
		int numB = 5;
		
		if (numA % numB ==0 || numB % numA == 0) {
			System.out.println("São multiplos");
			
		}else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}
