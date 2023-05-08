package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua residencia \n 1.Residencia \n 2.Comercio \n 3.Industria ");
		int residencia = sc.nextInt();
		
		System.out.printf("Digite de KW gasto: ");
		float gasto = sc.nextInt();
		
		switch (residencia) {
		case 1:
			System.out.printf("Valor total: " +gasto * 0.60+ " Conta de luz");
			break;
		case 2:
			System.out.printf("Valor total: " +gasto * 0.48+ " Conta de luz");
			break;
		case 3:
			System.out.printf("Valor total: " +gasto * 1.29+ " Conta de luz");
		}
		sc.close();
	


	}

}
