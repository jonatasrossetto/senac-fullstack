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
	}
	
	public static double CalculaDesconto(double price) {
		if (price<=500) {
			return price*0.05f;
		}
		else {
			return price*0.05f;
		}
	}
	
	//private static final DecimalFormat df = new DecimalFormat("0.00");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = lerDouble("valor do produto:");
		//System.out.println("Desconto: "+df.format(CalculaDesconto(valor)));
		System.out.println("Desconto: "+String.format("%.2f", CalculaDesconto(valor)));
		
	}

}
