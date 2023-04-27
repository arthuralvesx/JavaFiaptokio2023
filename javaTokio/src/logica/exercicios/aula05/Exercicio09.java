package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número, até (0-999): ");
		int num = entrada.nextInt();
		
		int centena = num/100;
		int dezena = (num % 100)/10;
		int unidade = num%10;
		
		System.out.println("Centena = " +centena * 100);
		System.out.println("Dezena = " +dezena * 10);
		System.out.println("Unidade = " +unidade);
		
		entrada.close();
		

	}

}
