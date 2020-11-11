package Exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o nome do titular: %n");
		String nome = sc.nextLine();
		System.out.printf("Digite o numero da conta: %n");
		int num = sc.nextInt();
		
		exConta conta = new exConta (num, nome);
		
		System.out.printf("Deseja realizar deposito? sim/nao %n");
		char res = sc.next().charAt(0);
		
		if (res == 's') {
			System.out.println("Valor do deposito:");
			double dep = sc.nextDouble();
			conta.dep(dep);			
		}
		
		System.out.println(conta.getSaldo());
		
		System.out.println("Qual o valor do saque?");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		
		System.out.println(conta.getSaldo());
		
		
		sc.close();
	}

}
