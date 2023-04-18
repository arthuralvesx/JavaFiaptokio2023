package logica.aulas.aula05;

import java.util.Scanner;

public class manipulacao {

	public static void main(String[] args) {
		
		double salario = 1300.50;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salarioStr.getClass().getSimpleName());
		
		
		System.out.println(" ");
		
		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		
		System.out.println(idadeInt);
		
		System.out.println(" "); // estou pulando uma linha
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o preco do produto: ");
		String preco = entrada.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println(precoFloat);
		
		entrada.close();
		
	}

}
