package estudo5;

import java.util.Scanner;

public class pessoa {

	public String nome;
	public int idade;
	public String corPreferida;
	
	
	
	public pessoa(String nome, int idade, String corPreferida) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.corPreferida = corPreferida;
	}

	public void perguntarNome() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual é o seu nome? ");
		this.nome = input.nextLine();
	}
	
	public void perguntarIdade() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual é a sua idade? ");
		this.idade = input.nextInt();
	}
	
	public void perguntarCorPreferida() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual é a sua cor preferida? ");
		this.corPreferida = input.nextLine();
	}
	
	public void mostrarDados() {
		System.out.println("----------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Cor preferida: "+this.corPreferida);
	}
	
	
	
	
}
