import java.util.Scanner;

public class teste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double consumoMedio=0;
		double distancia=100;
		double volume=9;
		
//		create an object of Scanner
//		Scanner input = new Scanner(System.in);
//		take input from the user
//		System.out.print("Entre com a distância: ");
//		double distancia = input.nextDouble();
//		System.out.print("Entre com o volume: ");
//		double volume = input.nextDouble();
//		System.out.println("------------");
		
		
		consumoMedio = distancia/volume;
		
		System.out.println("Distancia: "+distancia+" Km");
		System.out.println("Volume: "+volume+" litros");
		System.out.printf("%s%2.2f%s","Consumo medio: ",consumoMedio," Km/litro");
		
		
	} // fim do main

} // fim da class
