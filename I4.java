package listaI;

import java.util.Scanner;

/*Desenvolva um programa para ler um número e apresentar os resultados da tabuada deste
número.*/

public class I4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Insira um número: \n");
		n = sc.nextInt();	
			
		
			
			
			for(int m=1;m<=10;m++) {
				
				System.out.println(n + " X " + m + " = " + n*m);
				
				
			}
			System.out.println("---------------");
			
		

	}

}
