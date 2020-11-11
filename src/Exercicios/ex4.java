package Exercicios;

import java.util.Scanner;

public class ex4 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Preco do dolar: ");
		double pd = sc.nextDouble();
		
		System.out.println("Quantos dolares deseja comprar?");
		double comp = sc.nextDouble();
		
		System.out.println("Valor em reais a pagar: " + currencyConverter.preco(pd, comp));
		
		sc.close();
	}
	

}
