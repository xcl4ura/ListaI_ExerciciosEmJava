package listaI;

import java.util.Scanner;

/*Desenvolva um programa para ler a idade de um conjunto de alunos (N alunos) de uma sala de
aula e calcular a média das idades destes alunos.
*/

public class I7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, idade =0, idtotal =0;
		
		System.out.println("Insira a quantidade de alunos: \n");
		n = sc.nextInt();
		
		for(int a = 1; a <= n; a++) {
			
			System.out.println("Informe a idade do aluno:");
			idade = sc.nextInt();	
			idtotal = idtotal + idade;
		
		}
		
		System.out.println("A média é igual a: " + (idtotal /n) );
		

	}

}
 