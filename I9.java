package listaI;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de saga de filmes com 20 pessoas. O
programa deverá solicitar a opção de melhor saga de filme para o usuário. As sagas concorrentes
são: Matrix e Senhor dos Anéis. Ao final o programa deverá indicar qual foi à saga vencedora e o
total de votos de cada saga. Se ocorrer um empate, o mesmo deverá ser indicado.*/

public class I9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resp,matrix=0, sda =0; 
		
		for (int a= 1; a <=4; a++) {
			
			
		System.out.println("Informe qual a melhor saga de filmes sendo: \n\n1 para Matrix \n2 para Senhor dos Anéis");
		resp = sc.nextInt();
		
		if(resp == 1) {
			
			matrix++;
			
			
		}else if(resp ==2) {
			
			sda++ ;
			
		}	
		}
		if(matrix > sda) {
			
			System.out.println("O vencedor foi Matrix com " + matrix + " pontos e o perdedor foi Senhor dos Anéis com " + sda + " pontos");
			
			
		} else if(sda > matrix) {
			
			System.out.println("O vencedor foi Senhor dos Anéis com " + sda + " pontos e o perdedor foi Matrix com " + matrix + " pontos" );
			
			
		}else if(sda == matrix) {
			
			System.out.println("HOUVE EMPATE");
			
			
		}
}
}
