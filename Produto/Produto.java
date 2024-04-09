package unicid;

public class Produto {

	private int identificador;
	private String nome;
	private double preço;
	
	public void setIdentificador (int identificador) {
		if(identificador>0)
			this.identificador = identificador;
		else
			System.out.println("O identificador não pode ser negativo.");
	}
	
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
