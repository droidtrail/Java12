package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(F - 32) X 5/9 = C
		double f = 86;
		double c;
		final int     AJUSTE = 32;
		final double  FATOR = 5/9.0;
		
		c = ((f - AJUSTE) * (FATOR));
		System.out.println("Resultado 1: " + c);
		
		f = 150;
		c = ((f - AJUSTE) * (FATOR));
		System.out.println("Resultado 2: " + c);
	}
	
}
