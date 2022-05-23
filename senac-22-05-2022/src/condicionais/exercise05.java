package condicionais;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5) João Pescador, comprou um computador para controlar o rendimento diário de seu trabalho. Toda vez
//	que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado da Bahia (50
//	quilos) deve pagar uma multa de R$ 12,00 por quilo excedente. João precisa que você faça um Algoritmo
//	que leia a variável P (peso dos peixes) e verifique se há excesso. Se houver, gravar na variável E (Excesso)
//	e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o
//	conteúdo ZERO.
		
		
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
