package arrays;
import java.util.Scanner;

public class DessafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas: ");
		int quantNotas = entrada.nextInt();
		
		double[] notas = new double[quantNotas];

		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é: " + media + "!");
		entrada.close();
	}
}
