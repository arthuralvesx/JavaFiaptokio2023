package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {
		float num1 = 5f;
		float num2 = 2f;
		
		float soma = num1 + num2;
		System.out.println(soma);
		
		float sub = num1 - num2;
		System.out.println(sub);
		
		float mult = num1 * num2;
		System.out.println(mult);
		
		float div = num1 / num2;
		System.out.println(div);
		
		float resto = num1 % num2;
		System.out.println(resto);
		
		System.out.println(" ");
		
		
		//OPERADORES UNIÁRIOS
		int numero = 15;
		System.out.println("\n" +numero);
	
		//numero++;
		System.out.println(++numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(numero+1);
		System.out.println(numero);
		System.out.println(--numero);
		
		
		//OPERADOR DE ATRIBUIÇÃO
		
		int number = 5;
		
		number += 8;
		System.out.println("\n" +number);
		
		number -= 2;
		System.out.println(number);
		
		
		

	}

}
