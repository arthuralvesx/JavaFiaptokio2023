package logica.aulas.aula07;

import java.util.Scanner;

public class WhilLaco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		int i = 0;
//		
//		while (i <= 10) {
//			System.out.println(".");
//			i++;
//		}
		
//		String jogar = "sim";
		
//		while (jogar.equals("sim")) {
//			System.out.println("Repete ou inicia o jogo");
			
//			System.out.println("Deseja jogar novamente");
//			jogar = entrada.nextLine();
//		}
		
//		System.out.println("oiii");

//	}
		
		//MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while(i < 10) {
			i++;
			
			if(i == 3 || 1 == 5) {
				continue;
			}
			if (i == 7) {
				break;
			}
			
			System.out.println("Cambalhota" + i);
		}
		System.out.println("Fim do programa!");

} }
