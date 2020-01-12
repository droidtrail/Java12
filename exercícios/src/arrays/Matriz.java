package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantos notas por alunos? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int aluno = 0;  aluno < notasDaTurma.length; aluno++) {
		
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				
			System.out.printf("Informe a nota %d do aluno %d: ", aluno + 1, nota + 1);
				
				notasDaTurma[aluno][nota] = entrada.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("M�dia da turma � " + media);
		
		for (double[] notasDoAluno: notasDaTurma) {
		
			System.out.println(Arrays.toString(notasDoAluno));
		}
		entrada.close();
	}
}
