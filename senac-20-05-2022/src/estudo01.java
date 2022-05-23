
public class estudo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implementa o método da bissecção para encontrar a raiz de uma função
		// real, neste caso a raiz da equação tan(x)=1, ou função de teste f(x)=1-tan(x)=0
		// a solução seria pi/4=0,785398163397rad
		
		double a=0; // inicio do intervalo
		double b=1; // fim do intervalo
		double fcentro=1; // valor da funcao de teste
		double fa=0; // funcao de teste calculada no ponto a
		double fb=0; // funcao de teste calculada no ponto b
						
		while (Math.abs(fcentro)>0.0000001) {
			
			double centro=(a+b)/2; // posição central do intervalo
			
//			System.out.println("a= "+a);
//			System.out.println("b= "+b);
			System.out.println("centro= "+centro);
			
			fa=1-Math.tan(a); // calcula a função no ponto a
			fb=1-Math.tan(b); // calcula a função no ponto b
			fcentro=1-Math.tan(centro); // calcula a função no ponto central do intervalo
			if ((fa*fcentro)<0) { // testa se a raiz está no intervalo [a,centro]
				b=centro;
			} else { // testa se a raiz está no intervalo [centro,b]
				a=centro;
			}
			
//			System.out.println("fcentro= "+fcentro);
			
		}
		
	
		
	} // fim do main

} // fim da classe
