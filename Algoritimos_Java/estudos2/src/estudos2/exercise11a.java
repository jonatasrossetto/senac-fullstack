package estudos2;

import java.util.Scanner;

public class exercise11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		create an object of Scanner
		Scanner input = new Scanner(System.in);

		char sair = 'n';

		while (sair=='n'||sair=='N') {
			int opcao = OptionsMenu();
			double valorA = ReadDouble("Entre com o valor A: ");
			double valorB = ReadDouble("Entre com o valor B: ");
			Calculator(opcao, valorA, valorB);
			sair = Quit();
		} // end of while
		System.out.println("Calculadora finalizada");
		input.close();
	} //end of main

	
	public static int OptionsMenu() {
		Scanner input = new Scanner(System.in);
		String entrada="";
		int opcao=0;
		System.out.println("Calculadora Simples");
		System.out.println("-------------------");
		System.out.println("Operações disponíveis:");
		System.out.println("1 - soma (A+B)");
		System.out.println("2 - subtração (A-B)");
		System.out.println("3 - multiplicação (A*B)");
		System.out.println("4 - divisão (A/B)");
		
		while (opcao<1 || opcao>4) {
			System.out.print("Qual a sua opção: ");
			entrada = input.next();
			if (isNumeric(entrada)) {
				opcao=Integer.parseInt(entrada);
			} 
			if (opcao<1 || opcao>4) {
				System.out.println("opção inválida");
			}
		}
			
		System.out.println("");
		System.out.println("---------------");
		return opcao;
	}
	
	public static double ReadDouble(String texto) {
		Scanner input = new Scanner(System.in);
		System.out.print(texto);
		double valor = input.nextFloat();
		return valor;
	}

	public static void Calculator(int opcao, double valorA, double valorB) {
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
			} //end if divisão
			else {
				System.out.println("Atenção B precisa ser diferente de zero!!");
			} // end else
			break;
	}
	}
	
	public static char Quit() {
		Scanner input = new Scanner(System.in);
		System.out.println("------------------");
		System.out.print("Sair? (S/N): ");
		char quit = input.next().charAt(0);
		System.out.println("\n\n");
		System.out.println("------------------");
		return quit;
	}
	
	public static boolean isNumeric(String strNum) {
		// https://www.baeldung.com/java-check-string-number
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
} // end of class
