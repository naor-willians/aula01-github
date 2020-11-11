package Exercicios;

import java.util.Scanner;

public class ex3 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		exAluno x = new exAluno();
		
		System.out.println("Digite as notas: ");
		x.n1 = sc.nextDouble();
		x.n2 = sc.nextDouble();
		x.n3 = sc.nextDouble();
		
		double media =x.nFinal();
		
		if ( media > (media * 6 )/ 100) {
			System.out.printf("Nota: %.2f" + media + "%nParabens");
			
		}
		else {
			double a = 100 - media;
			System.out.println("Nota: " + media + " Faltaram " + a + "pontos");
		}
		
		sc.close();
	}

}
