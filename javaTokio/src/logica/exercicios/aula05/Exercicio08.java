package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos reais você quer converter: ");
		double valorReal = entrada.nextDouble();
		
		double dolar = 0.2;
		double euro = 0.18;
		double pesoArgentino = 44.65;
		double libraEsterlina = 0.16;
		double iene = 26.95;
		
		double converteDolar = valorReal*dolar;
		System.out.printf("Valor em dolar:%.2f" , converteDolar);
		
		double converteEuro = valorReal*euro;
		System.out.printf("\nValor em euro:%.2f" , converteEuro);
		
		double convertePeso = valorReal*pesoArgentino;
		System.out.printf("\nValor em peso argentino:%.2f" , convertePeso);
		
		double converteLibraesterlina = valorReal*libraEsterlina;
		System.out.printf("\nValor em libra esterlina:%.2f" , converteLibraesterlina);
		
		double converteEiene = valorReal*iene;
		System.out.printf("\nValor em iene:%.2f" , converteEiene);
		
	}

}
