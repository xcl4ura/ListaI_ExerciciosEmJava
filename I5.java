package listaI;

import java.util.Scanner;

/*Desenvolva um programa para ler quatro notas de 10 alunos e calcular a média destas notas por
aluno.*/


public class I5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
	int nota1,nota2,nota3,nota4, media;
	
	
	
		for (int al= 0; al <=10; al++) {
			
			
		System.out.println("Insira a Primeira nota\n");
		nota1 = sc.nextInt();
		
		System.out.println("Insira a Segunda nota\n");
		nota2 = sc.nextInt();
		
		System.out.println("Insira a Terceira nota\n");
		nota3 = sc.nextInt();
		
		System.out.println("Insira a Quarta nota\n");
		nota4 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("\nA média do aluno é: " + media);
}
		
		
	}

}
