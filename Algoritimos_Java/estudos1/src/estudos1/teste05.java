package estudos1;

public class teste05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numeros = new double[]{2,3,5,7};
		int i = 0;
		double somaCubos=0.0;
		for (i=0;i<numeros.length;i++) {
			somaCubos = somaCubos + Math.pow(numeros[i],3);
			System.out.println("numero["+i+"]: "+numeros[i]);
			System.out.println("numero["+i+"]^3: "+Math.pow(numeros[i],3));
			
		} // end of for i
		System.out.println("soma dos cubos: "+somaCubos);
		
		
		
		
		
	} // end of main

} // end of class
