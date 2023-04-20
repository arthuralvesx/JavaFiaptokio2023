package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valor = entrada.nextDouble();
		
		System.out.println("Digite o valor pago: ");
		double valorPago = entrada.nextDouble();
		
		
		double valorTroco = valorPago - valor;
		
		System.out.println("Seu troco é " +valorTroco+ " reais.");
		

		entrada.close();

	}

}
