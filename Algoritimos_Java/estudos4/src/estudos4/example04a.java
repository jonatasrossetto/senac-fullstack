package estudos4;

import java.util.Scanner;

public class example04a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] valores = new int[10];
		int[] valoresPar = new int[10];
		int[] valoresImpar = new int[10];
		int incPar =0; // counts the quantity of even values
		int incImpar =0;  // counts the quantity of odd values
		
		for(int i=0; i<10; i++) {
			System.out.print("entre com o valor["+i+"]: ");
			valores[i]=input.nextInt();
			if (valores[i]%2==0) {
				valoresPar[incPar]=valores[i];
				incPar++;
			} else {
				valoresImpar[incImpar]=valores[i];
				incImpar++;
			}
		} // end for
		
		// display all the values
		System.out.println("---------------");
		System.out.println("valores");
		for(int i=0; i<10; i++) {
			System.out.println("valor["+i+"]: "+valores[i]);
		} // end for
		
		// display all the even values
		System.out.println("---------------");
		System.out.println(incPar+" valores pares");
		for(int i=0; i<incPar; i++) {
			System.out.println("valor["+i+"]: "+valoresPar[i]);
		} // end for
		
		// display all the odd values
		System.out.println("---------------");
		System.out.println(incImpar+" valores impares");
		for(int i=0; i<incImpar; i++) {
			System.out.println("valor["+i+"]: "+valoresImpar[i]);
		} // end for
		
		input.close();
		
	} // end main

} // end class
