package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Digite a nota (ou -1 para sair): ");
			entrada.useLocale(Locale.US);
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota; // total = nota + nota;
				quantidadeDeNotas++;
			} else if (nota > 10) {
				System.out.println("Nota inválida. Digite uma nota entre 0 e 10");
			}
		}
		//Calculando a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média do aluno = " + media);
		entrada.close();
	}
}
