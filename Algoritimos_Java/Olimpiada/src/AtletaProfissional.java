
public class AtletaProfissional extends Atleta {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void receberAumento(int aumento) {
		this.salario += aumento;
	} // end receber aumento
	
	public void receberAumento(double percentual) {
		this.salario += this.salario*percentual/100;
	} // end receber aumento
	
	
}
