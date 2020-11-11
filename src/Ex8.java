import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario, imposto;
		
		System.out.println("Digite o salario:");
		salario = sc.nextDouble();
		
		if ( salario <= 2000.0) {
			
			System.out.println("Isento");
		}
		
		if (salario > 2000.0 && salario <= 3000.0) {
			
			imposto = salario * 8 /100;
			System.out.println("Valor do imposto: " + imposto);
		}
		
		if (salario > 3000.0 && salario <= 4500.0) {
			
			salario =- 2000.0;
			imposto = salario * 18 /100;
			System.out.println("Valor do imposto: "+ imposto);
			
		}
		
		if (salario > 4500.0) {
			
			salario =- 2000.0;
			imposto = salario * 28 /100;
			System.out.println("Valor do imposto: "+ imposto);
			
		}
		
		
		sc.close();

	}

}
