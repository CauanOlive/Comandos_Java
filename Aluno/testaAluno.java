package unicid;

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
