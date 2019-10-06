package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Digite a nota: ");
		float nota = entrada.nextFloat();
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
		}else if(nota >=8) {
			System.out.println("Nota A!");
		} else if (nota >=6) {
			System.out.println("Nota B!");
		} else if(nota >= 5) {
			System.out.println("Nota C!");
		} else if (nota >= 4 ) {
			System.out.println("Nota D!");
		} else {
			System.out.println("Nota E!");
		}
		System.out.println("Fim!");
		entrada.close();
	}

}
