package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario do colaborador: ");
		
		double salario = sc.nextInt();
		double percentual,novoSalario,aumento;
		
		if (salario <= 280) {
			percentual = 0.20;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			System.out.printf("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario);
		
		}else if (salario <= 700) {
			percentual = 0.15;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			System.out.printf("Reajunte"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario);
			
		}else if (salario <= 1500) {
			percentual = 0.10;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			System.out.printf("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario);
			
		}else {
			percentual = 0.05;
			novoSalario = salario + salario * percentual;
			aumento = novoSalario - salario;
			System.out.printf("Reajuste"
					+ "\nSalario: %.2f"
					+ "\nPercentual: %.2f"
					+ "\nAumento: %.2f"
					+ "\nNovo Salario: %.2f", salario, percentual, aumento, novoSalario);
			sc.close();
		}
		
	}
	

}
