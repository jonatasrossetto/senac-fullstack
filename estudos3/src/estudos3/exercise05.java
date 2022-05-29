package estudos3;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		double entrada = 1;
		int quantidade = 0;
		double soma = 0;
		double[] valor = new double[5]; 
		
//		while (entrada!=0) {
//			System.out.println("quantidade: "+quantidade);
//			System.out.print("digite um valor:");
//			entrada = input.nextDouble();
//			valor[quantidade]=entrada;
//			soma=soma+entrada;
////			System.out.println("quantidade: "+quantidade);
////			System.out.println("soma: "+soma);
//			quantidade++;
//		} // end while
//		System.out.println("Media: "+(soma/(quantidade-1)));
		
		while (quantidade<5) {
			System.out.println("indice: "+quantidade);
			System.out.print("digite um valor:");
			entrada = input.nextDouble();
			valor[quantidade]=entrada;
			soma=soma+entrada;
//			System.out.println("quantidade: "+quantidade);
//			System.out.println("soma: "+soma);
			quantidade++;
		} // end while
		
		
		System.out.println("-------------------------");
		System.out.println("soma: "+soma);
		System.out.println("quantidade de numeros: "+valor.length);
		System.out.println("-------------------------");
		System.out.println("Media: "+(soma/(quantidade)));
		
		for (int i=0;i<5;i++) {
			System.out.println("valor["+i+"]: "+valor[i]);
		}
		System.out.println("fim do programa");

	} // end main

} // end class