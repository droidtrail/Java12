package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		//Integer i = 10000;
		//Conertendo String para Inteiro
		Integer i = Integer.parseInt(entrada.nextLine());
		
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		
		entrada.close();

	}

}
