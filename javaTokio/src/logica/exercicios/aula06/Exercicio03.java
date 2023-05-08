package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite sua segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite sua terceira nota: ");
		int nota3 = sc.nextInt();
		
		System.out.println("Digite sua quarta nota: ");
		int nota4 = sc.nextInt();
		
		float media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if(media >= 7) {
			System.out.println("Aprovado " +media);
			
		}else if (media >=5 && media < 7) {
			System.out.println("Recuperação" +media);
			
		}else {
			System.out.println("Reprovado");
		}
	sc.close();	
	}

}
