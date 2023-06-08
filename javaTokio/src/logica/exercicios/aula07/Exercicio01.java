package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);
	String sair;
	
	do {
			System.out.println("Olá Mundo");
			System.out.println("Desaja Sair? [s]/[n] ");
			sair = sc.nextLine();
			
	}while(!sair.equals("sair".toLowerCase()) && !sair.equals("s".toLowerCase()));

	System.out.println("Programa encerrado");
	sc.close();
	
	}

}
