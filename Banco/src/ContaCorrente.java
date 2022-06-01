
public class ContaCorrente {

	private String numeroConta;
	private double saldo;
	
	public void depositar(double valor) {
		if (valor>1000) {
			this.saldo = this.saldo+valor+(0.2/100)*valor;
		} 
		else {
			this.saldo = this.saldo+valor;
		}
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo-valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
