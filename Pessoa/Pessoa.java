//	 1) Crie uma classe chamada Pessoa. Uma pessoa possui um nome, idade, peso e altura. 
//	 O IMC é uma sigla utilizada para Índice de Massa Corporal, que é uma medida 
//	 utilizada para medir a obesidade. Fórmula: imc = peso / altura² ou imc = Peso / 
//	 (altura*altura) 
//	 Crie uma classe TestaPessoa
//	 - Crie um objeto da classe Pessoa
//	 - Inicialize todos os atributos
//	 - Imprima os valores dos atributos da classe Pessoa, o valor do imc e a 
//	   mensagem de acordo com a tabela acima.


package unicid;

public class Pessoa {

	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	// Construtores
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, double peso, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Metódo para calcular o IMC 
	
	public void calculaIMC() {
		
		double result;
		
		result = (peso / (altura * altura));
	
		if(result <17.00) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Muito abaixo do peso.");
		}
		
		if(result >17.00 && result < 18.49){
			System.out.println("Valor do IMC: "+result);
			System.out.println("Abaixo do peso.");
		}
		
		if(result >18.5 && result < 24.99) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Peso normal.");
		}
		
		if(result > 25.00 && result < 29.99) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Acima do peso.");
		}
		
		if(result > 30.00 && result < 34.99) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Obesidade 1.");
		}
		
		if(result > 35.00 && result < 39.99) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Obesidade 2 (severa).");
		}
		
		if(result > 40.00) {
			System.out.println("Valor do IMC: "+result);
			System.out.println("Obesidade 3 (mórbida).");
		}
		
		}
	
		// Metódo de imprimir
	
		public void imprime() {
		
		System.out.println("=======================================");
		System.out.println("Nome...: "+nome);
		System.out.println("Idade..: "+idade);
		System.out.println("Peso...: "+peso);
		System.out.println("Altura.: "+altura);
	}
	
	
}
