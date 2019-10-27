package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	//Construtor
	Data() {
		
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		this(1, 1, 1970);
	}

	//Construtor
	Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {

		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", this.dia, mes, ano);
	}
}
