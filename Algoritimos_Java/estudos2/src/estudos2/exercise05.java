package estudos2;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pesoPeixes = 52f;
		final double limitePeso = 50f;
		final double taxaMulta =12f; 
		double excesso = 0f;
		double multaTotal = 0f;
		
		if (pesoPeixes > limitePeso) {
			excesso = pesoPeixes - limitePeso;
			multaTotal = excesso * taxaMulta;
		} 
		else { // este else poderia ser excluido pois excesso e multaTotal foram inicializados inicialmente como zero
			excesso = 0;
			multaTotal = 0;
		}
		
		System.out.println("Peso dos peixes: "+pesoPeixes);
		System.out.println("excesso: "+excesso);
		System.out.println("total da multa: "+multaTotal);
		
	} // end main

} // end class
