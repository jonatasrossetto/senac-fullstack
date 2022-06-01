package estudos4;

import java.util.Scanner;

public class example05 {

	public static void Imprimir() {
		System.out.println("Favor preencher os dados abaixo ");
		System.out.println("Nome: ");
		System.out.println("Endereco: ");
		System.out.println("Telefone: ");
		System.out.println("Idade: ");
	} // end imprimir
	
	public static int Somar(int valorA, int valorB) {
		return valorA+valorB;
	} // end somar
	
	public static int Subtrair(int valorA, int valorB) {
		return valorA-valorB;
	} //end subtrair
	
	public static int Multiplicar(int valorA, int valorB) {
		return valorA*valorB;
	} // end multiplicar
	
	public static double Dividir(int valorA, int valorB) {
		double resultado = 0;
		if (valorB==0) {
			System.out.println("divisao por zero!!");
			return 0;
		} 
		return valorA/valorB; 
	}// end dividir
	
	public static int lerInteiro(String texto) {
		Scanner input = new Scanner(System.in);
		System.out.print(texto);
		int valor=input.nextInt();
		input.nextLine();
//		input.close();
		return valor;
	} // end ler inteiro
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir();
		//System.out.println("outro texto");
		//Imprimir();
		
		int valorA = lerInteiro("digite o numero A:");
		int valorB = lerInteiro("digite o numero B:");
		
//		int resultado = Somar(valorA, valorB);
		System.out.println("o valor de "+valorA+"+"+valorB+"="+Somar(valorA, valorB));
//		int resultado = Subtrair(valorA, valorB);
		System.out.println("o valor de "+valorA+"-"+valorB+"="+Subtrair(valorA, valorB));
//		int resultado = Multiplicar(valorA, valorB);
		System.out.println("o valor de "+valorA+"*"+valorB+"="+Multiplicar(valorA, valorB));
//		int resultado = Dividir(valorA, valorB);
		System.out.println("o valor de "+valorA+"/"+valorB+"="+Dividir(valorA, valorB));
	} // end main

} // end class
