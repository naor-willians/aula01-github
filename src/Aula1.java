import javax.swing.JOptionPane;

public class Aula1 {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero:"));
		
		if (num >= 0) {
			System.out.println("Não Negativo");
			
		} else
			System.out.println ("Negativo");

	}

}
