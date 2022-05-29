package estudos3;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		double y=0;
		String nome ="";
		String endereco="";
		String lixo="**";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nome = input.next();
		lixo = input.nextLine(); // collects the garbage after the first input.next
		System.out.print("Endereco: ");
		endereco = input.nextLine();
		System.out.print("x: ");
		x = input.nextInt();
		System.out.print("y: ");
		y = input.nextDouble();
		
		
		
		System.out.println("nome: "+nome);
		System.out.println("endereco: "+endereco);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("lixo: "+lixo);
		
		
	}

}
