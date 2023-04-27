package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numeroInteiro = 5;
		float numeroFloat = 10.6f;
		double numeroDouble = 10.5;
		
		System.out.printf("%d %.2f %.2f", numeroInteiro, numeroFloat, numeroDouble);
		
		String numeroIntStr = Integer.toString(numeroInteiro);
		String numeroFloatStr = Float.toString(numeroFloat);
		String numeroDoubleStr = Double.toString(numeroDouble);
		
		System.out.printf("%s %s %s", numeroIntStr, numeroFloatStr, numeroDoubleStr );
		
			
	}

}
