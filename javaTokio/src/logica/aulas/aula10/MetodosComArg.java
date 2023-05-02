package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
		//METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
		
		static void saudacaoComArgs(String nome, int idade) {
			
			if (idade >= 18) {
				System.out.printf("Ola, %s! Voce tem %d anos e eh maior de idade\n", nome, idade);
			}else {
				System.out.printf("Ola, %s! Voce tem %d anos e eh menor de idade\n", nome, idade);
			}
	}
						
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite seu nome: ");
	String nome = sc.nextLine();
	
	System.out.print("Digite sua idade: ");
	int idade = sc.nextInt();
	
	saudacaoComArgs(nome, idade);
	
	sc.close();
	
	}
	
}