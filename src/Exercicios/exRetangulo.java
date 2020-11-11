package Exercicios;

public class exRetangulo {
	
	public double altura;
	public double base;
	
	
	public double area() {
		
		return base * altura;
	}
	
	public String toString() {
		
		return String.format("%.2f", area());
	}

}
