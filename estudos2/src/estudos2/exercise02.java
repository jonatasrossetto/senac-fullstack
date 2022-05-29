package estudos2;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
