package estudos4;

import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try to implement a sort method
		
		Scanner input = new Scanner(System.in);
		int[] valores = new int[10];

		for(int i=0; i<4; i++) {
			System.out.print("entre com o valor["+i+"]: ");
			valores[i]=input.nextInt();
		} // end for
		
		boolean end = false;
		int i = 0;
		while (end==false) {
			end=true;
			int aux = 0;
			if (valores[i]>valores[i+1]) {
				aux = valores[i];
				valores[i] = valores[i+1];
				valores[i+1] = aux;
				end=false;
			}
			
//			for(int inc=0; inc<4; inc++) {
//				System.out.println("valor["+inc+"]: "+valores[inc]);
//			} // end for
//			System.out.println("i: "+i);
//			System.out.println("-------------");
			for(int inc=0; inc<2; inc++) {
				if (valores[inc]>valores[inc+1]) {
					end=false;
					}
			} // end for
			
			if (i==2) {
				i=0;
			} else {
				i=i+1;
			}
		}
		for(int inc=0; inc<4; inc++) {
		System.out.println("valor["+inc+"]: "+valores[inc]);
	} // end for
		
		
		
		input.close();
	}

}
