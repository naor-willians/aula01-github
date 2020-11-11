package Exercicios;

public class exConta {
	
	private String nome;
	private int num;
	private double saldo;
	
	public exConta(int num, String nome) {
		this.nome = nome;
		this.num = num;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void dep(double dep) {
		saldo += dep;
	}
	
	public void sacar(double saque) {
		saldo -= saque;
	}

}
