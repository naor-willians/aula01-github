
public class Impar {

	public static void main(String[] args) {
		
		int i= 0, y= 1, a = 0;
		double soma;
		
		while ( i <= 99) {

			soma = y % 2;
			
			if (soma != 0) {
				a = a + y;
				
				y++;

			} 
			else
				y++;
		
			i++;
		} 
		
		System.out.println(a);
		

		
		/*while (i <= 99) {
			
			soma = b + y;
			System.out.println(soma);
			y = y + 2;
			b = b + 2;
			i+=2;
		}
		
		for(i=1; i<= 99; i+=2) {
			
			soma = y + i;
			
			
			
			if (soma != 0) {
				y+=y;
				System.out.println(y);
				y+=2;
			}
			else {
				y++;
			}
			
			System.out.println("Este a: " + a);
				System.out.println("Este y " + y);
			
			
		}*/

	}

}
