package estudos4;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] valores = new int[6];
		for(int i=0; i<6; i++) {
			System.out.print("entre com o valor["+i+"]: ");
			valores[i]=input.nextInt();
		} // end for
		for(int i=5; i>=0; i--) {
			System.out.println("valor["+i+"]: "+valores[i]);
		} // end for
		
		
		input.close();
	}

}
