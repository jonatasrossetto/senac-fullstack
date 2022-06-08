package estudos3;

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int quantidadeAdultos = 0;
		
		for (int i=1;i<=5;i++) {
			System.out.print("Digite a idade da pessoa ["+i+"]: ");
			int idade = input.nextInt();
			if (idade>=18) {
				quantidadeAdultos++;
			} // end if
			//System.out.println("quantidade de adultos: "+quantidadeAdultos);
		} //end for
		System.out.println("quantidade de adultos: "+quantidadeAdultos);

	} // end main
} // end class
