package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		//Utilizando Método Construtor com passagem de parâmetro
		Produto p1 = new Produto("Produto 1 -> Notebook.");
		//p1.nome = "Produto 1 -> Notebook.";
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		//Utilizando Método Construtor sem passagem de parâmetro
		var p2 = new Produto();
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.5);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);

	}

}
