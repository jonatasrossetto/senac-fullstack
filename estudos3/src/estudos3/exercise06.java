package estudos3;

public class exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double graos=1;
		int casa=1;
		double soma=1;
		while (casa<=64) {
			System.out.println("casa= "+casa);
			System.out.println("graos= "+graos);
			System.out.println("total de graos= "+soma);
			graos = graos*2;
			soma=soma+graos;
			casa=casa+1;
			
		} // end while
		
		
	} // end main

} // end class