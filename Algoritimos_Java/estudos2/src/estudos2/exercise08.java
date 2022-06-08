package estudos2;

public class exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		double valor = 29;
		double valorNota = 5;
		double qtdNotas = 0;
		double troco = 0;
		
//		if ((valor%valorNota)!=0) {
////			System.out.println(valor-valor%valorNota);
////			qtdNotas=Math.floor(valor/valorNota)+1;
//			qtdNotas = (valor-valor%valorNota)/valorNota+1;
//			troco = qtdNotas*valorNota-valor;
//			System.out.println("preco do produto: "+valor);
//			System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota+" reais");
//			System.out.println("o troco sera: "+troco+" reais");			
//		} //end if
//		else if ((valor % valorNota)==0) {
////			qtdNotas=Math.floor(valor/valorNota);
//			qtdNotas = (valor-valor%valorNota)/valorNota;
//			troco = qtdNotas*valorNota-valor;
//			System.out.println("pre�o do produto: "+valor);
//			System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota+" reais");
//			System.out.println("o troco ser�: "+troco+" reais");		
//		} //end else
		
//		System.out.println((int)29.9);
		
//		//Refactoring #1
//		if ((valor%valorNota)!=0) {
//			qtdNotas = (valor-valor%valorNota)/valorNota+1;
//		}
//		else if ((valor % valorNota)==0) {
//			qtdNotas = (valor-valor%valorNota)/valorNota;
//		}
//			troco = qtdNotas*valorNota-valor;
//			System.out.println("pre�o do produto: "+valor);
//			System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota+" reais");
//			System.out.println("o troco ser�: "+troco+" reais");			

		//Refactoring #2
		if ((valor%valorNota)!=0) {
			qtdNotas = (int)(valor/valorNota)+1;
		}
		else if ((valor % valorNota)==0) {
			qtdNotas = (int)(valor/valorNota);
		}
		troco = qtdNotas*valorNota-valor;
		System.out.println("pre�o do produto: "+valor);
		System.out.println("cliente deve pagar com "+qtdNotas+" notas de 5 reais, totalizando "+qtdNotas*valorNota+" reais");
		System.out.println("o troco ser�: "+troco+" reais");			

			
		
	} // end main

} // end class
