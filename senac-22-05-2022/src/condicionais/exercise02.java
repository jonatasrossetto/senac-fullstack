package condicionais;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2) Fa�a um algoritmo para ler: nome do cliente, saldo inicial, d�bito e cr�dito. Ap�s, calcular e
//	escrever o saldo atual (saldo atual = saldo inicial - d�bito + cr�dito). Tamb�m testar se saldo atual for maior
//	ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.
		
		String nome = "Joao";
		double saldoInicial = 100f;
		double debito=-500;
		double credito=100;
		double saldoAtual=saldoInicial+credito-debito;
		System.out.println("saldo atual: "+saldoAtual);
		if (saldoAtual>=0) {
			System.out.println("Ola, "+nome+" o seu saldo esta positivo: "+saldoAtual);
		} // end if
		else {
			System.out.println("Ola, "+nome+" o seu saldo esta negativo: "+saldoAtual);
		}
	}

}
