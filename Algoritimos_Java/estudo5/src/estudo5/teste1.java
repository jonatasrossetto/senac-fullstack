package estudo5;

public class teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoa aluno = new pessoa("sheila",46,"preto");
		aluno.mostrarDados();
		
		System.out.println("----------------------------");
		aluno.perguntarNome();
		aluno.perguntarIdade();
		aluno.perguntarCorPreferida();
		aluno.mostrarDados();
		System.out.println(aluno.nome);
		System.out.println(aluno);
		
		
		
		
		
		
		int[] valor = new int[3];
		valor[0]=3;
		valor[1]=2;
		valor[2]=1;
		System.out.println(valor);
		int[] valorB = new int[3];
		valorB=valor;
		System.out.println(valorB);
	} // end main

} // end class
