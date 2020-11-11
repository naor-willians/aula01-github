import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor de x:");
		double x = sc.nextDouble();
		
		System.out.println("Digite o valor de y:");
		double y = sc.nextDouble();
		
		if( x > 0 && y > 0) {
			
			System.out.println("Q1");
		}
		
		if ( x < 0 && y < 0) {
			
			System.out.println("Q3");
			
		}
		
		if ( x > 0 && y < 0) {
			
			System.out.println("Q4");
		}
		
		if ( x < 0 && y > 0) {
			
			System.out.println("Q2");
		}
		
		if ( x == 0 && y == 0) {
			
			System.out.println("Origem");
		}
		
		
		
		sc.close();

	}

}
