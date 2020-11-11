package Exercicios;

public class exFuncionario {
	
	public String name;
	public double salarioB;
	public double salario;
	public double imposto;
	
	
	public double sLiq() {
		
		return salario = salarioB - imposto;
	}
	
	public String toString() {
		
		return name + String.format(", %.2f", salario);
	}
	
	public void aumento(double porcentagem) {
		
		salario += salario * porcentagem / 100;
	}

}
