package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<exEmpregados> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serão registrados?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double sal = sc.nextDouble();
			list.add(new exEmpregados(id, nome, sal));
		}
		
		System.out.println("Id do empregado para receber aumento: ");
		int a = sc.nextInt();
		
		exEmpregados result = list.stream().filter(x -> x.getId() == a).findFirst().orElse(null);
		
		if ( result == null) {
			System.out.println("Id não existe");
		}
		else {
			System.out.println("Qual a porcentagem do aumento: ");
			double por = sc.nextDouble();
			result.porcentagem(por);
		}
		
		for (exEmpregados obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
