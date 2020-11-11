import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite dois numeros:");
		
		int a, b;
		
		 a = sc.nextInt();
		 b = sc.nextInt();
		
		if (a > b) {
			
			if (a % b == 0) {
			System.out.println("Sao Multiplos");

		} else
			System.out.println("Nao Sao Multiplos");
		
		}	
		if (b > a) {
			if (b % a == 0) {
				System.out.println("Sao Multiplos");

			} else
				System.out.println("Nao Sao Multiplos");
			
		
		}
		
			
		
		
		sc.close();

	}
		
}
