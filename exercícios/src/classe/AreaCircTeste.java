package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		// a1.pi = 10;

		

		// AreaCirc.PI = 3.1415;
		System.out.printf("A área do círculo 1 é: %.2f\n", a1.area());

	
		System.out.printf("A área do círculo 2 é: %.2f\n", AreaCirc.area(100));
		System.out.println("O valor de P.I é: " + AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
