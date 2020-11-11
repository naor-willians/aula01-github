package Exercicios;

import java.util.Scanner;

public class ex2 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		exFuncionario x = new exFuncionario();
		
		System.out.println("Name:");
		x.name = sc.nextLine();
		System.out.println("SalarioB:");
		x.salarioB = sc.nextDouble();
		System.out.println("Imposto:");
		x.imposto = sc.nextDouble();
		
		
		System.out.println("Dados: " + x.name + "," + x.sLiq());
		
		System.out.println("Porcentagem de aumento:");
		double p = sc.nextDouble();
		
		x.aumento(p);
		
		System.out.println("Dados: " + x);

		
		sc.close();
	}

}
