package unicid;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	
	public double Reajuste(double salario) {
		
		double novo;
		
		if(salario <= 150.00) {
			novo = salario * 0.75;
			novo = novo + salario;
		}
		else if(salario > 150.00 && salario <= 300.00) {
			novo = salario * 0.20;
			novo = novo + salario;
		}
		else if(salario > 300.00 && salario <= 600.00) {
			novo = salario * 0.15;
			novo = novo + salario;
		}
		else {
			novo = salario * 0.10;
			novo = novo + salario;
		}
		return novo;
	}
	
}
