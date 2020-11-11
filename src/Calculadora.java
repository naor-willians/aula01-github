import java.util.Scanner;

public class Calculadora {
	
	public static void main ( String [] args) {
		
		double a, b, result;
		int c;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite \n 1 para Somar \n 2 para Multiplicar\n 3 para Subtrair\n 4 para dividir\n 5 para Sair");
		c = sc.nextInt();
		
		while ( c != 5) {
		
		switch (c) {
		
			case 1:
				System.out.println("Digite o primeiro numero:");
				a = sc.nextDouble();
				System.out.println("Digite o segundo numero:");
				b = sc.nextDouble();
				result = a + b;
				System.out.println(result);
				
			case 2:
				System.out.println("Digite o primeiro numero:");
				a = sc.nextDouble();
				System.out.println("Digite o segundo numero:");
				b = sc.nextDouble();
				result = a * b;
				System.out.println(result);
				
			case 3:
				System.out.println("Digite o primeiro numero:");
				a = sc.nextDouble();
				System.out.println("Digite o segundo numero:");
				b = sc.nextDouble();
				result = a - b;
				System.out.println(result);
				
			case 4:
				System.out.println("Digite o primeiro numero:");
				a = sc.nextDouble();
				System.out.println("Digite o segundo numero:");
				b = sc.nextDouble();
				result = a / b;
				System.out.println(result);
		
		}
		
		System.out.println("Digite 1 para Somar \n 2 para Multiplicar\n 3 para Subtrair\n 4 para dividir ou 5 para Sair");
		c = sc.nextInt();
		
		}
		
		
		sc.close();
	}

}
