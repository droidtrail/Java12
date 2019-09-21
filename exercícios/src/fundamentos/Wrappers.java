package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		//Integer i = 10000;
		//Conertendo String para Inteiro
		//Integer.parseInt(entrada.nextLine());
		
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//String para Boleano
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Character c = '#'; //char
		System.out.println(c.toString());
		System.out.println(c + "...");
		
	}

}
