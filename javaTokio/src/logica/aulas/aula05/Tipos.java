package logica.aulas.aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		
		System.out.println("Flot 1: " + preco);
		System.out.println("Float 2: " + preco2);
		
		int precoInteiro = (int) 2.50;
		System.out.println("Valor inteiro: " + precoInteiro);
		
		int numerox = 6;
		double numeroxDouble = numerox;
		System.out.println(" ");
		System.out.println(numerox);
		System.out.println(numeroxDouble);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numeroIn = (int) entrada.nextDouble();
		
		System.out.println(numeroIn);
		
		entrada.close();
	}

}
