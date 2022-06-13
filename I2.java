package listaI;



/*Desenvolva um programa para apresentar as letras de “a” até “z” em ordem crescente e depois
em ordem decrescente.*/

//LAURA XAVIER CHAGAS

public class I2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for(char cresc = 'a';cresc <= 'z'; cresc++) {
			
			System.out.println(cresc);
			
		} 
		System.out.println("------------");

		for(char dec = 'z';dec >= 'a'; dec--) {
			
			System.out.println(dec);
			
		} 
	}

}
