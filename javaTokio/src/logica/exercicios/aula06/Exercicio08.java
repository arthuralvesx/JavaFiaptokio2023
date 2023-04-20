package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos reais você quer converter: ");
		double valorReal = entrada.nextDouble();
		
		double dolar = 5.06;
		double euro = 5.55;
		double pesoArgentino = 0.023;
		double libraEsterlina = 6.29;
		double iene = 0.038;
		
		double converteDolar = valorReal*dolar;
		System.out.println();
		
		double converteEuro = valorReal*euro;
		System.out.println();
		
		double convertePeso = valorReal*pesoArgentino;
		System.out.println();
		
		double converteLibraesterlina = valorReal*libraEsterlina;
		System.out.println();
		
		double convertEiene = valorReal*iene;
		System.out.println();
		
	}

}
