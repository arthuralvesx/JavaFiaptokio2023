package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	static void saudacao() {
		System.out.println("Bem vindo ao programa");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("ola, %s! voce tem %d anos \n", nome, idade);
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idadde");
		}
		
	}

	public static void main(String[] args) {
		
		saudacao();
		

	}

}
