package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	//Construtor
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	//Construtor
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	String obterDataFormatada() {

		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
}
