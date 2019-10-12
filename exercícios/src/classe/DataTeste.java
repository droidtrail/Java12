package classe;

import java.util.Scanner;

import controle.Continue;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		d1.dia = entrada.nextInt();

		if (d1.dia <= 1 || d1.dia >= 31) {
			System.out.println("Dia inválido. Digite valores entre 1 e 31");
		} else {
			System.out.print("Digite o mês: ");
			d1.mes = entrada.nextInt();

			if (d1.mes <= 1 || d1.mes >= 12) {
				System.out.println("Mês inválido. Digite valores entre 1 e 12");
			} else {

				System.out.print("Digite o ano: ");
				d1.ano = entrada.nextInt();

				if (d1.ano <= 1900 || d1.ano >= 2019) {
					System.out.println("Ano inválido. Digite valores entre 1900 e 2019");
				} else {
					System.out.printf("A data digitada foi: %d/%d/%d", d1.dia, d1.mes, d1.ano);
				}

			}

		}

	}

}
