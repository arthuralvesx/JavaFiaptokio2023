package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2){
			System.out.println("O primeiro número digitado é maior");
		}else if (num1 < num2) {
			System.out.println("O primeiro número digitado é menor");
		}else {
			System.out.println("Os números são iguais");
			sc.close();
		}
		

	}

}
