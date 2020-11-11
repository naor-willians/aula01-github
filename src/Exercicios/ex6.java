package Exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		exQuarto[] vect = new exQuarto[9];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int num = sc.nextInt();
			vect[num] = new exQuarto(nome, email);
		}
		
		for (int i=0; i<vect.length; i++) {
			
			if(vect[i] != null) {
				System.out.println(vect[i] + "Quarto: " + i);
			}
			
		}
		
		sc.close();
	}

}
