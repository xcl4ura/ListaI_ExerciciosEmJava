package listaI;

import java.util.Scanner;

/* Desenvolva um programa para calcular o reajuste salarial de todos os funcionários de um
empresa. O programa deverá solicitar a leitura da quantidade de funcionários, além do código e o
salário atual de cada funcionário e realizar o reajuste salarial de cada funcionário de acordo com a
tabela abaixo. O programa deverá apresentar os seguintes valores para cada funcionário: salário
antigo, salário novo e reajuste. */



public class I8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, cod, salAtu, salNov, reaj;
		
		System.out.println("Informe a quantidade de funcionários: ");
		n = sc.nextInt();
		
		for(int a = 1;a<=n;a++) {
		System.out.println("Informe o código");
		cod = sc.nextInt();
		
		System.out.println("Informe o salário atual");
		salAtu = sc.nextInt();
		
		if(cod==1) {
			
			reaj = (salAtu / 100)*5;
			salNov = salAtu + reaj;
			
			System.out.println("O salário de R$" + salAtu + " foi alterado para R$" + salNov + " com o reajuste de 5%, tendo um acréscimo de R$" + reaj + "\n\n");
			
		}else if(cod==2) {
			
			reaj = (salAtu / 100)*15;
			salNov = salAtu + reaj;
			
			System.out.println("O salário de R$" + salAtu + " foi alterado para R$" + salNov + " com o reajuste de 15%, tendo um acréscimo de R$" + reaj + "\n\n");
			
		}else if(cod==3) {
			
			reaj = (salAtu / 100)*25;
			salNov = salAtu + reaj;
			
			System.out.println("O salário de R$" + salAtu + " foi alterado para R$" + salNov + " com o reajuste de 25%, tendo um acréscimo de R$" + reaj + "\n\n");
		}else if(cod==4) {
			
			reaj = (salAtu / 100)*30;		
			salNov = salAtu + reaj;
			
			System.out.println("O salário de R$" + salAtu + " foi alterado para R$" + salNov + " com o reajuste de 30%, tendo um acréscimo de R$" + reaj + "\n\n");
		}
		
		}
		
		
		
	}

}
