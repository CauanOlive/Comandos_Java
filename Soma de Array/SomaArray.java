package unicid;

// 	Criar um programa que leia dois vetores de inteiros de 10 posições, efetue a soma 
//	dos valores dos elementos de mesmo índice dos dois vetores colocando o resultado 
//	em um terceiro vetor. Exiba na tela o vetor resultante. 


import java.util.Scanner;

public class SomaArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double[] v1 = new double[10];
		double[] v2 = new double[10];
		double[] v3 = new double[10];
		
		for(int i = 0 ; i < v1.length ; i++) {
			
			System.out.println("Digite o valor da "+(i + 1)+"° posição do vetor 1.");
			
			v1[i] = sc.nextDouble();
		}
		
		for(int i = 0 ; i < v2.length ; i++) {
			
			System.out.println("Digite o valor da "+(i + 1)+"° posição do vetor 2.");
			
			v2[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < v3.length ; i++) {
			
			v3[i] = v1[i] + v2[i];
			System.out.println("Resultado da soma: "+v3[i]+" - "+(i + 1)+"° posição do vetor 3.");
		}

	}

}
