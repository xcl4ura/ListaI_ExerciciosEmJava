package listaI;

import java.util.Scanner;

/* Desenvolva um programa para ler a média de 20 alunos e calcular a quantidade de alunos que
foram aprovados. Para um aluno ser aprovado a sua média deve ser maior ou igual a 6.*/

public class I6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4, media,alApro = 0;
		
		
		
		for (int al= 1; al <=20; al++) {
			
			
		System.out.println("Insira a Primeira nota\n");
		n1 = sc.nextInt();
		
		System.out.println("Insira a Segunda nota\n");
		n2 = sc.nextInt();
		
		System.out.println("Insira a Terceira nota\n");
		n3 = sc.nextInt();
		
		System.out.println("Insira a Quarta nota\n");
		n4 = sc.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("\nA média do aluno é: " + media);
		
		if(media >=6) {

			alApro++;			
		}else {
			
			System.out.println("Aluno reprovado!");
		}
}
		System.out.println("\nAo todo "+alApro +" alunos foram aprovados.\n");
		
		
		
	}

}
