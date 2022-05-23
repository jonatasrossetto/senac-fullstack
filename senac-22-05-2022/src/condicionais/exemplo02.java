package condicionais;

public class exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int par = 0;
		int impar = 0;
		int valor=11;
		
		// "valor % 2" retorna o resto da divisão de valor por 2
		
		if (valor % 2 == 0) {
			par = valor;
			System.out.println("O valor eh par!!");
		} //end if
		else {
			impar = valor;
			System.out.println("O valor eh impar!!");
		}
		
		System.out.println("valor: "+valor);
		System.out.println("par: "+par);
		System.out.println("impar: "+impar);
		
				
	}

}
