package listaI;

import java.util.Scanner;

/*	Desenvolva um programa para apresentar os números de 1 até 100 em ordem crescente e depois
em ordem decrescente.
*/

//LAURA XAVIER CHAGAS 1DSV 

public class I1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		for(int c=1;c<=100;c++){		
			
			System.out.println(c);
		
		
		}
		
		System.out.println("---------");
		
		for (int d = 100; d >=1; d--) {
			 
			System.out.println(d);
			
		}
	}

}
