package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio12Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ladoA = sc.nextInt();
		int ladoB = sc.nextInt();
		int ladoC = sc.nextInt();
		
		System.out.printf("LadoA: %d \nLadoB: %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		
		int X = 0;
		
		if(ladoA < ladoB) {
			X = ladoA;
			ladoA = ladoB;
			ladoB = X;
			System.out.printf("LadoA: %d \nLadoB: %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		}
		
		if (ladoB < ladoC) {
			X = ladoB;
			ladoB = ladoC;
			ladoC = X;
			System.out.printf("LadoA: %d \nLadoB: %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		}
		
		if (ladoA < ladoB) {
			X = ladoA;
			ladoA = ladoB;
			ladoB = X;
			System.out.printf("LadoA: %d \nLadoB: %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		}
		if (ladoA >= (ladoB = ladoC)) {
			System.out.println("não forma retangulo");
		}else {
			
			if((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)){
				System.out.println("triangulo retangulo");	
			} else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("triangulo obtusangulo");
			} else {
				System.out.println("triangulo acutangulo");
			}
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("triangulo equilatero");
			}
			if ((ladoA == ladoB && ladoC != ladoA) || (ladoB == ladoC && ladoA != ladoB)) {
				System.out.println("triangulo isosceles");
				
			}
		}
	}
}
