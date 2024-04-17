package unicid;

//	 1A) Escreva uma classe chamada Aluno que contenha os atributos privados 
//	denominados nome, matricula, nota1, nota2, nota3, peso1, peso2 e peso3. Além 
//	disso,
//	a. Crie um construtor-padrão para a classe.
//	b. Crie um construtor que inicialize todos os membros de dados com os valores 
//	recebidos como argumento.
//	c. Crie os métodos de acesso (getters e setters) para todos os atributos. Os 
//	métodos setters devem validar os dados de entrada conforme as regras definidas 
//	abaixo:
//	- o nome deve conter pelo menos dois caracteres;
//	- a matrícula deve ser constituída de 9 dígitos apenas;
//	d. Escreva um método público para calcular a média ponderada das três notas;
//	1B) Escreva a classe TestaAluno contendo o método main;
//	- Crie dois objeto da classe Aluno;
//	- inicialize com e sem atributos;
//	- mostre o nome, matrícula e a média do aluno;



public class testaAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Cauan","123456789",1.0,2.0,3.0,8.5,5.0,7.5);
		
		a1.setNome("Larissa");
		a1.setMatricula("012345678");
		a1.setNota1(5.5);
		a1.setNota2(6.0);
		a1.setNota3(7.5);
		a1.setPeso1(1.0);
		a1.setPeso2(2.0);
		a1.setPeso3(3.0);

		System.out.println("1° Aluno: "+a1.getNome());
		System.out.println("Matricula: "+a1.getMatricula());
		System.out.println("Media Ponderada: "+a1.mediaPonderada());
		System.out.println("==========================================");
		System.out.println("1° Aluno: "+a2.getNome());
		System.out.println("Matricula: "+a2.getMatricula());
		System.out.println("Media Ponderada: "+a2.mediaPonderada());
	
	}

}
