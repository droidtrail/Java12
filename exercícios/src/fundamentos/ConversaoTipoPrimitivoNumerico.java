package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//CONVERS�O IMPL�CITA
		//Convertendo INTEGER para DOUBLE
		double a = 1.1234578888888;
		System.out.println(a);
		
		//Convers�o EXPL�CITA (cast)
		float b = (float) 1.1234578888888;
		System.out.println(b);
		
		int  c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);

	}

}
