package estudos4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class example06 {

	public static double lerDouble(String texto) {
		Scanner input = new Scanner(System.in);
		System.out.print(texto);
		double valor=input.nextDouble();
		input.nextLine();
//		input.close();
		return valor;
	} // end ler double
	
	public static double calculaDesconto(double price) {
		if (price<500) {
			return price*0.05f;
		}
		else {
			return price*0.05f;
		}
	} // end calcula desconto
	
	//private static final DecimalFormat df = new DecimalFormat("0.00");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = lerDouble("valor do produto:");
		//System.out.println("Desconto: "+df.format(CalculaDesconto(valor)));
		System.out.println("Desconto: "+String.format("%.2f", calculaDesconto(valor)));
		System.out.println("Preco final: "+String.format("%.2f", valor - calculaDesconto(valor)));
		
	} // end main

} // end class
