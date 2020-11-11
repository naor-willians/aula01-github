package Exercicios;

public class exEmpregados {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public exEmpregados(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId () {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Id: " + id
				+ ", Nome: " + nome
				+ ", Salario: " + salario;
	}
	
	public void porcentagem (double porcen) {
		salario += salario * porcen / 100;
	}

}
