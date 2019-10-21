package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Método Construtor da classe com parâmetro
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Método Construtor da classe sem parâmetro
		Produto(){
			
		}

	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
