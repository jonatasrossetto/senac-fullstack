import java.util.Scanner;

public class Funcionario {

	private String nome;
	private String matricula;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 

	public void cadastrarNome() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cadastrar nome: ");
		this.nome = input.nextLine();
	} // end cadastrar nome
	
	public void cadastrarMatricula() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cadastrar matricula: ");
		this.matricula = input.nextLine();
	}	 // end cadastrar matricula
	
	public void cadastrarSalario() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cadastrar salario: ");
		this.salario = input.nextDouble();
	}	// end cadastrar salario
	
	public double calcularBrutoAnual() {
		return this.salario*12;
	} // end calcular bruto anual
	
	public void receberAumento(int aumento) {
		this.salario += aumento;
	} // end receber aumento
	
	public void receberAumento(double percentual) {
		this.salario += this.salario*percentual/100;
	} // end receber aumento
	 
} // end class
