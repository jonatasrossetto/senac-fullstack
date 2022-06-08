package estudos4;

import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animais = new String[5];
		animais[0] = "cachorro";
		animais[1] = "gato";
		animais[2] = "coelho";
		animais[3] = "vaca";
		animais[4] = "cavalo";
		
		for (int i=0;i<5;i++) {
			System.out.println("Animal["+i+"]: "+animais[i]);
		} // end for
		
		System.out.println("----------------------");
		
		Scanner input = new Scanner(System.in);
		String[] pais = new String[5];
		for (int i=0;i<5;i++) {
			System.out.print("pais["+i+"]: ");
			pais[i]=input.nextLine();
		}
		for (int i=0;i<5;i++) {
			System.out.println("pais["+i+"]: "+pais[i]);
		} // end for
		input.close();
	} //end main

} //end class
