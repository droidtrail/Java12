package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//Digitar a operação (+ - * / %)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o tipo de operação matemática que deseja executar: ");
		String opm = entrada.next();
	
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		//Lógica
		double resultado = "+".equals(opm) ? num1 + num2 : 0;
			   resultado = "-".equals(opm) ? num1 - num2 : resultado;
		       resultado = "*".equals(opm) ? num1 * num2 : resultado;
		       resultado = "/".equals(opm) ? num1 / num2 : resultado;
		       resultado = "%".equals(opm) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, opm, num2, resultado);
		entrada.close();
	}

}
