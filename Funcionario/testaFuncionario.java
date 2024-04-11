package unicid;

import java.lang.reflect.Array;

public class testaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f[] = new Funcionario[4];
		
		 f[0] = new Funcionario();
		 f[0].setNome("Cauan Oliveira");
		 f[0].setSalario(120.00);
		 
		 f[1] = new Funcionario();
		 f[1].setNome("Jose da Silva");
		 f[1].setSalario(200.00);
		 
		 f[2] = new Funcionario();
		 f[2].setNome("Maria da Penha");
		 f[2].setSalario(400.00);
		 
		 f[3] = new Funcionario();
		 f[3].setNome("Pedro Ferraz");
		 f[3].setSalario(650.00);
		 
		 
		 
		 for(int i = 0; i < f.length ; i++) {
			 
			 System.out.println("Nome....: "+f[i].getNome());
			 System.out.println("Salario.: "+f[i].getSalario());
			 System.out.println("Reajuste: "+f[i].Reajuste(f[i].getSalario()));
			 System.out.println("=============================");
		 }
		 
		 System.out.println("Soma dos salarios.: "+ Soma(f));
		 System.out.println("Soma dos reajustes: "+ somaReajuste(f));
	}
	
	public static double Soma(Funcionario[] array) {
		
		double soma = array[0].getSalario();
		for(int i = 1 ; i < array.length ; i++) {
			
			soma = soma + array[i].getSalario();
		}
		
		return soma;
		
	}
	
public static double somaReajuste(Funcionario[] array) {
		
		double soma = array[0].Reajuste(array[0].getSalario());
		for(int i = 1 ; i < array.length ; i++) {
			
			soma = soma + array[i].Reajuste(array[i].getSalario()); 
		}
		
		return soma;
		
	}
	

}
