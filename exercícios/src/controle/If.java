package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();

		if (media >= 7.0 && media <= 10) {

			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if (media >= 4.5 && media < 7) {
			System.out.println("Recupera��o!");
		}
		
		boolean criterioReprovacao = media >= 0 && media <= 4.5;
		
		if(criterioReprovacao) {
			
			System.out.println("Reprovado!");
		}
		entrada.close();
	}

}
