package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//M�todo Construtor da classe com par�metro
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//M�todo Construtor da classe sem par�metro
		Produto(){
			
		}

	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
