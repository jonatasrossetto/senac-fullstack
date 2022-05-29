package estudos2;

public class exemploCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota=7;
		
		switch (nota) {
		case 0, 1, 2:
			System.out.println("SC - sem conceito");
			break;
		case 3, 4 , 5:
			System.out.println("R - regular");
			break;
		case 6, 7, 8:
			System.out.println("B - bom");
			break;
		case 9:
		case 10:
			System.out.println("MB - muito bom");
			break;
		default:
			System.out.println("n�o � uma nota v�lida");
		} // end case
		
		
	} // end main

} // end class
