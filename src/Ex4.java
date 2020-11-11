import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int ini, fim, dur;
		
		System.out.println("Digite o horário de inicio do jogo:");
		ini = sc.nextInt();
		
		System.out.println("Digite o horário do fim do jogo:");
		fim = sc.nextInt();
		
		
		if (ini < fim) {
			
			dur = fim - ini;
			
		} else 
			dur= 24 - ini + fim;
			
		
		System.out.println ("O jogo durou " + dur + " horas");
		
		
			
		sc.close();

	}

}
