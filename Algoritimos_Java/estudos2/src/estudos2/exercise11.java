package estudos2;

import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		create an object of Scanner
		Scanner input = new Scanner(System.in);
//		take input from the user
		System.out.println("Opera��es dispon�veis:");
		System.out.println("1 - soma (A+B)");
		System.out.println("2 - subtra��o (A-B)");
		System.out.println("3 - multiplica��o (A*B)");
		System.out.println("4 - divis�o (A/B)");
		System.out.print("Qual a sua op��o: ");
		int opcao = input.nextInt();
		System.out.println("");
		System.out.println("---------------");
		System.out.print("Entre com o valor A: ");
		double valorA =  input.nextFloat();
		System.out.print("Entre com o valor B: ");
		double valorB =  input.nextFloat();
		System.out.println("");
		System.out.println("---------------");
		
//		if (opcao==1) {
//			System.out.println("A+B= "+(valorA+valorB));
//		} // end if adi��o
//		else if (opcao==2) {
//			System.out.println("A-B= "+(valorA-valorB));
//		} // end if subtra��o
//		else if (opcao==3) {
//			System.out.println("A*B= "+(valorA*valorB));
//		} // end if multiplica��o
//		else if (opcao==4) {
//			if (valorB!=0) { 
//				System.out.println("A/B= "+(valorA/valorB));
//			} //end if divis�o
//			else {
//				System.out.println("Aten��o B precisa ser diferente de zero!!");
//			} // end else
//		}
		
		// Refactoring #1 - using switch/case
		
		switch (opcao) {
			case 1:
				System.out.println("A+B= "+(valorA+valorB));
				break;
			case 2:
				System.out.println("A-B= "+(valorA-valorB));
				break;
			case 3:
				System.out.println("A*B= "+(valorA*valorB));
			case 4:
				if (valorB!=0) { 
					System.out.println("A/B= "+(valorA/valorB));
				} //end if divis�o
				else {
					System.out.println("Aten��o B precisa ser diferente de zero!!");
				} // end else
				break;
		}
		
		
		 input.close();
	} //end of main

} // end of class
