package condicionais;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5) Jo�o Pescador, comprou um computador para controlar o rendimento di�rio de seu trabalho. Toda vez
//	que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado da Bahia (50
//	quilos) deve pagar uma multa de R$ 12,00 por quilo excedente. Jo�o precisa que voc� fa�a um Algoritmo
//	que leia a vari�vel P (peso dos peixes) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso)
//	e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o
//	conte�do ZERO.
		
		
		double pesoPeixes = 52f;
		final double limitePeso = 50f;
		final double taxaMulta =12f; 
		double excesso = 0f;
		double multaTotal = 0f;
		
		if (pesoPeixes > limitePeso) {
			excesso = pesoPeixes - limitePeso;
			multaTotal = excesso * taxaMulta;
		} 
		else {
			excesso = 0;
			multaTotal = 0;
		}
		
		System.out.println("Peso dos peixes: "+pesoPeixes);
		System.out.println("excesso: "+excesso);
		System.out.println("total da multa: "+multaTotal);
		
	} // end main

} // end class
