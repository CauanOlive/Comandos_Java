package unicid;

public class testaPessoa {

	public static void main(String[] args) {

		// Instanciando os objetos
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa("Jose",25,95.00,1.75);
		Pessoa p4 = new Pessoa("Maria",30,100.00,1.63);
		
		p1.setNome("João");
		p1.setIdade(50);
		p1.setPeso(80.00);
		p1.setAltura(1.68);
		
		p2.setNome("Claudia");
		p2.setIdade(40);
		p2.setPeso(65.00);
		p2.setAltura(1.72);
		
		// Calculando e imprimindo 
		
		p1.imprime();
		p1.calculaIMC();
		p2.imprime();
		p2.calculaIMC();
		p3.imprime();
		p3.calculaIMC();
		p4.imprime();
		p4.calculaIMC();
		
	
	}

}
