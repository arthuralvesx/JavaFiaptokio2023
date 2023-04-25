package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos reais você quer converter: ");
		double valorReal = entrada.nextDouble();
		
		double dolar = 5.06;
		double euro = 5.55;
		double pesoArgentino = 0.023;
		double libraEsterlina = 6.20239;
		double iene = 0.038;
		
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
