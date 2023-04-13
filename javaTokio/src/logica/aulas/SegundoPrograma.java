package logica.aulas;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua Idade");
		System.out.println("Sua Idade é: " + entrada.nextLine());
		
		System.out.println("Bem-vindo, " + nome);
	
	}
}
