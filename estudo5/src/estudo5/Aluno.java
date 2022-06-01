package estudo5;

import java.util.Scanner;

public class Aluno {

	public String matricula;
	public String nome;
	public double notaProva1;
	public double notaProva2;
	public double notaTrabalho;
	
	
	public void lerMatricula() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual eh a sua matricula? ");
		this.matricula = input.nextLine();
	} // end ler matricula
	
	
	public void lerNome() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual eh o seu nome? ");
		this.nome = input.nextLine();
	} // end ler nome
	
		
	public void lerNotaProva1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual eh a nota da prova 1? ");
		this.notaProva1 = input.nextDouble();
		if (this.notaProva1>10|this.notaProva1<10) {
			System.out.println("valor invalido, a nota deve ser um numero entre 0 e 10");
		}
	} // end ler nota prova 1
	
	
	public void lerNotaProva2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual eh a nota da prova 2? ");
		this.notaProva2 = input.nextDouble();
		if (this.notaProva2>10|this.notaProva2<10) {
			System.out.println("valor invalido, a nota deve ser um numero entre 0 e 10");
		}
	} // end ler nota prova 2
		
	
	public void lerNotaTrabalho() {
		Scanner input = new Scanner(System.in);
		System.out.print("Qual eh a nota do trabalho? ");
		this.notaTrabalho = input.nextDouble();
		if (this.notaTrabalho>10|this.notaTrabalho<10) {
			System.out.println("valor invalido, a nota deve ser um numero entre 0 e 10");
		}
	} //end ler nota trabalho
	
	
	public void mostraDados() {
		System.out.println("---------------------------");
		System.out.println("Matricula: "+this.matricula);
		System.out.println("Nome: "+this.nome);
		System.out.println("Nota da prova 1: "+this.notaProva1);
		System.out.println("Nota da prova 2: "+this.notaProva2);
		System.out.println("Nota do trabalho: "+this.notaTrabalho);
		System.out.println("---------------------------");
	} // end mostrar dados
	
	
	public void calcularMedia() {
		double media = (this.notaProva1+this.notaProva2+this.notaTrabalho)/3;
		//System.out.println("Media: "+String.format("%.2f",media));
		System.out.println("Media: "+media);
		if (media>=7) {
			System.out.println("Aluno aprovado");			
		} 
		else {
			System.out.println("Aluno reprovado");
		}
	} // end calcular media
	
	
} // end class
