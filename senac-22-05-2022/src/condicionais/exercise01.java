package condicionais;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1) Fa�a um Algoritmo que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero �
//	positivo ou negativo.
		
		int valor = 10;
		
//		create an object of Scanner
		Scanner input = new Scanner(System.in);
//		take input from the user
		System.out.print("Entre com valor: ");
		valor = input.nextInt();
		
		
		if (valor>0) {
			System.out.println("O valor eh positivo");
		} //end if
		else {
			System.out.println("O valor eh negativo");
		}
		
		

	} // end main

} // end class
