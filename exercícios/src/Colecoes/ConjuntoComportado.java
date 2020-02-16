package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Luca");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for (int n : nums) {
			System.out.println(n);
		}
	}
}
