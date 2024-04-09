//  Implemente a classe Produto contendo os seguintes itens: 
//  Identificador (inteiro), nome (String), preço (double). 
//	Crie métodos Getters e Setters para atribuir e pegar o conteúdo dos itens anteriores. 
//	Deve-se prestar atenção as seguintes restrições para as atribuições: 
//		- O identificador não poderá ser um número negativo. 
//		- O preço não poderá ser menor do que 1,00 nem maior do que 10.000,00. 
//		P.S.: Para todos os itens acima, deverá ser mostrada uma mensagem de erro.

package unicid;

public class Produto {

	private int identificador;
	private String nome;
	private double preço;

	// Construtor
	
	public void setIdentificador (int identificador) {
		if(identificador>0)
			this.identificador = identificador;
		else
			System.out.println("O identificador não pode ser negativo.");
	}
	
	// Getters e Setters
	
	public int getIdentificador() {
		return identificador;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setPreço (double preço) {
		if(preço>1.00 && preço < 10000.00)
				this.preço = preço;
			else
				System.out.println("O preço deve ser entre 1,00 e 10.000,00.");
	}
	
	public double getPreço() {
		return preço;
	}
	
}
