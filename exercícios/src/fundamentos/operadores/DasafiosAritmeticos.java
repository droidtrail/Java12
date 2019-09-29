package fundamentos.operadores;

public class DasafiosAritmeticos {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		//Elevando ao cubo
		int b = (int) Math.pow(a, 3);//Cast
		double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		int Exp_1     = 0;
		int Div_Exp_1 = 0;
		int Div_Exp_2 = 0;
		int Exp_3     = 0;
		int Exp_2     = 0;
		int num_1     = 1;
		int num_2     = 2;
		int num_3     = 3;
		int num_5     = 5;
		int num_6     = 6;
		int num_7     = 7;
		int num_10    = 10;
		
		Exp_1      = (int) Math.pow((num_6 * (num_3 + num_2)), num_2);
		Div_Exp_1  = Exp_1 /  (num_3 * num_2);
		
		//System.out.println(Div_Exp_1);
		
		Exp_2     = (int) Math.pow((num_1 - num_5) * (num_2 - num_7 ) / num_2, 2);
		
		//System.out.println(Exp_2);
		
		Exp_3 =  (int) Math.pow(Div_Exp_1 - Exp_2, num_3) / (int) Math.pow(num_10, num_3);
		
		System.out.println("Resultado Final: " + Exp_3);
	}

}
