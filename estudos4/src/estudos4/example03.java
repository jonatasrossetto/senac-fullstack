package estudos4;
import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] nome = new String[5];
		int[] idade = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("entre com o nome["+i+"]: ");
			nome[i]=input.nextLine();
			System.out.print("entre com a idade["+i+"]: ");
			idade[i]=input.nextInt();
			input.nextLine();
		} // end for
		
		System.out.println("-----------------------");
		for(int i=0; i<5; i++) {
			if (idade[i]>=18) {
				System.out.println("Nome["+i+"]: "+nome[i]+" , idade["+i+"]: "+idade[i]);
			}
		} // end for
		
		input.close();
	
	} // end main

} // end class
