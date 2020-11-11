import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 int cod, quant;
		 double preco;
		 
		 System.out.println("Digite o codigo do produto:");
		  cod = sc.nextInt();
		  
		  while (cod > 5) {
				System.out.println ("Codigo invalido");
				System.out.println("Digite o codigo do produto:");
				  cod = sc.nextInt();

			 }
		 
		 System.out.println("Digite a quantidade:"); 
		  quant = sc.nextInt();
		 
		 if (cod == 1) {
			 
			 preco = 4.00;
			 
			 preco = preco * quant;
			 
			 System.out.println("Total: " + preco);
		 }
		 
		 if (cod == 2) {
			 
			 preco = 4.50;
			 
			 preco = preco * quant;
			 
			 System.out.println("Total: " + preco);
		 }
		 
		 if (cod == 3) {
			 
			 preco = 5.00;
			 
			 preco = preco * quant;
			 
			 System.out.println("Total: " + preco);
		 }
		 
		 if (cod == 4) {
			 
			 preco = 2.00;
			 
			 preco = preco * quant;
			 
			 System.out.println("Total: " + preco);
		 }
		 
		 if (cod == 5) {
			 
			 preco = 1.50;
			 
			 preco = preco * quant;
			 
			 System.out.println("Total: " + preco);
		 
		 } 
		 
		 
		 sc.close();

	}

}
