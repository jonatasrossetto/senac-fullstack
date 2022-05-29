package estudos1;

public class estudo01 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		// implementa o m�todo da bissec��o para encontrar a raiz de uma fun��o
		// real, neste caso a raiz da equa��o tan(x)=1, ou fun��o de teste f(x)=1-tan(x)=0
		// a solu��o seria pi/4=0,785398163397rad
		
		double a=0; // inicio do intervalo
		double b=1; // fim do intervalo
		double fcentro=1; // valor da funcao de teste
		double fa=0; // funcao de teste calculada no ponto a
		double fb=0; // funcao de teste calculada no ponto b
						
		while (Math.abs(fcentro)>0.0000001) {
			
			double centro=(a+b)/2; // posi��o central do intervalo
			
//			System.out.println("a= "+a);
//			System.out.println("b= "+b);
			System.out.println("centro= "+centro);
			
			fa=1-Math.tan(a); // calcula a fun��o no ponto a
			fb=1-Math.tan(b); // calcula a fun��o no ponto b
			fcentro=1-Math.tan(centro); // calcula a fun��o no ponto central do intervalo
			if ((fa*fcentro)<0) { // testa se a raiz est� no intervalo [a,centro]
				b=centro;
			} else { // testa se a raiz est� no intervalo [centro,b]
				a=centro;
			}
			
//			System.out.println("fcentro= "+fcentro);
			
		}
		
	
		
	} // fim do main

} // fim da classe
