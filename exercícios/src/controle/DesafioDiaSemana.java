package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um númer: ");
		String diaDaSemanda = entrada.next();
		
		if("Domingo".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(1);
		}else if("segunda".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(2);
		}else if("terça".equalsIgnoreCase(diaDaSemanda) 
			  || "terca".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(3);
		}else if("quarta".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(4);
		}else if("quinta".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(5);
		}else if("sexta".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(6);
		}else if("sábado".equalsIgnoreCase(diaDaSemanda) 
			  || "sabado".equalsIgnoreCase(diaDaSemanda)) {
			System.out.print(7);
		} else {
			System.out.print("Dia inválido!");
		}	
		entrada.close();	
	}
}
