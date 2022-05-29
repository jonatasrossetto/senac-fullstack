package estudos2;

public class exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//			char gender = 'F';
//			double altura = 1.54;
			
			char gender = 'm';
			double altura = 1.73;
			double pesoIdeal=0f;
			
			if (gender=='M' || gender=='m') {
				pesoIdeal = (72.7*altura-58);
				System.out.println("Para homens com "+altura+"m de altura, o peso ideal é "+pesoIdeal+"Kg");
			}
			else if (gender=='F' || gender=='f') {
				pesoIdeal = (62.1*altura-44.7);
				System.out.println("Para mulheres com "+altura+"m de altura, o peso ideal eh "+pesoIdeal+"Kg");
			} 
			else {
				pesoIdeal=0;
				System.out.println("Valor invalido para o genero. M=masculino, F=feminino  ");
			}
		} // end main

	} // end class
