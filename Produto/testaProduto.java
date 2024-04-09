package unicid;

public class testaProduto {

	public static void main(String[] args) {
		
		// Instanciando o Objeto

		Produto p[] = new Produto[3];
		
		p[0] = new Produto();
		p[0].setNome("Feijão");
		p[0].setIdentificador(12);
		p[0].setPreço(10.00);
		
		p[1] = new Produto();
		p[1].setNome("Arroz");
		p[1].setIdentificador(13);
		p[1].setPreço(12.00);
		
		p[2] = new Produto();
		p[2].setNome("Frango");
		p[2].setIdentificador(14);
		p[2].setPreço(22.00);
		
		for (int i = 0 ; i < p.length ; i++) {
			
			System.out.println("Nome.........: "+p[i].getNome());
			System.out.println("Identificador: "+p[i].getIdentificador());
			System.out.println("Preço........: "+p[i].getPreço());
			System.out.println("===========================");
			
		}
		
		System.out.println("Maior preço..: "+ maiorValor(p));

	}
	
	// Metódo para calcular o maior valor
	
	public static double maiorValor(Produto[] array) {
		
		double maior = array[0].getPreço();	
		
		for(int i = 1 ; i < array.length ; i++) {
			
			if (array[i].getPreço() > maior)
				maior = array[i].getPreço();
			}
		return maior;
	}

}
