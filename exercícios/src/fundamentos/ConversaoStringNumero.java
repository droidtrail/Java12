package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro número:");
		
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo número:");
		
		double num_1 = Double.parseDouble(valor1);
		double num_2 = Double.parseDouble(valor2);
		double soma = num_1 + num_2;
		
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma/2);
		
	}

}
