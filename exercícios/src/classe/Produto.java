package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//Método Construtor da classe com parâmetro
	Produto(String nomeInicial){
		nome = nomeInicial;
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
