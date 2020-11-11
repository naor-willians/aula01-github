package Exercicios;

import java.util.Scanner;

public class ex1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		exRetangulo x = new exRetangulo();
		
		System.out.println("Digite base e altura");
		x.base = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		System.out.println("Area: " + x);
		
		
		
		sc.close();
	}

}
