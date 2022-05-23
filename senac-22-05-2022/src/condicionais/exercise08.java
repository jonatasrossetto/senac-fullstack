package condicionais;

public class exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		8) Um terminal de autoatendimento com vários produtos só aceita notas de 5 reais. Declare e atribua o
//	preço de um produto em reais e diga quantas notas de 5 reais são necessárias para pagar o valor e qual o
//	troco deverá ser devolvido ao cliente.

		
		double valor = 26;
		double valorNota = 5;
		double qtdNotas = 0;
		double troco = 0;
		
		if ((valor%valorNota)!=0) {
			qtdNotas=Math.round(valor/valorNota)+1;
			troco = qtdNotas*valorNota-valor;
			System.out.println("preço do produto: "+valor);
			System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota);
			System.out.println("o troco será: "+troco);			
		} //end if
		else if ((valor % valorNota)==0) {
			qtdNotas=Math.round(valor/valorNota);
			troco = qtdNotas*valorNota-valor;
			System.out.println("preço do produto: "+valor);
			System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota+" reais");
			System.out.println("o troco será: "+troco+" reais");		
		} //end else
		
		
		
	} // end main

} // end class
