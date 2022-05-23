package condicionais;

public class exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		4) Desenvolva um programa que recebe do usuário o placar de um jogo de futebol (os gols de cada time) e
//	informa se o resultado foi um empate, a vitória do primeiro time ou do segundo time.

		
		int golsTimeA = 2;
		int golsTimeB = 2;
		
		if (golsTimeA == golsTimeB) {
			System.out.println("O jogo terminou empatado");
		}
		else if (golsTimeA > golsTimeB) {
			System.out.println("O time A ganhou o jogo");
		}
		else if (golsTimeA < golsTimeB) {
			System.out.println("O time B ganhou o jogo");
		}
		
		
	} // end main

} // end class
