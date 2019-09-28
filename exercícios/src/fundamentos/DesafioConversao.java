package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro salário do funcionário: ");
		String salario_1 = entrada.nextLine().replace(",", ".");

		System.out.print("\nDigite o segundo salário do funcionário: ");
		String salario_2 = entrada.nextLine().replace(",", ".");

		System.out.print("\nDigite o terceiro salário do funcionário: ");
		String salario_3 = entrada.nextLine().replace(",", ".");

		double num_1 = Double.parseDouble(salario_1);
		double num_2 = Double.parseDouble(salario_2);
		double num_3 = Double.parseDouble(salario_3);

		double media_salario = (num_1 + num_2 + num_3) / 3;

		System.out.println("\nA média salarial do funcionário é: " + media_salario);

		entrada.close();

	}

}
