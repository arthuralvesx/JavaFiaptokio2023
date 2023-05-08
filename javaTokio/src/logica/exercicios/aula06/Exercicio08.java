package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a distancia percorrida: ");
		
		float distancia = sc.nextInt();
		
		System.out.println("Digite o total de combustivel gasto: ");
		
		float combustivel = sc.nextInt();
		float KmLitro = distancia / combustivel;
		
		if(KmLitro < 8 ) {
			System.out.println("Esse carro tá bebendo mais que chevete!");
		}else {
			System.out.println("Autonomia do carro muito boa");
		}
		sc.close();
		
	}

}
