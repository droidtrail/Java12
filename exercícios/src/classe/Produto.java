package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//M�todo Construtor da classe com par�metro
	Produto(String nomeInicial){
		nome = nomeInicial;
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
