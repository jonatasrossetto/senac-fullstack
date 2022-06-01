
public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario professor = new Funcionario();
		
		professor.cadastrarNome();
		professor.cadastrarMatricula();
		professor.cadastrarSalario();
		
		System.out.println("-------------------");
		System.out.println("Matricula: "+professor.getMatricula());
		System.out.println("Nome: "+professor.getNome());
		System.out.println("Salario: "+professor.getSalario());
		System.out.println("Salario bruto anual: "+professor.calcularBrutoAnual());
		System.out.println("-------------------");
		professor.receberAumento(500);
		System.out.println("Salario: "+professor.getSalario());
		System.out.println("Salario bruto anual: "+professor.calcularBrutoAnual());
		System.out.println("-------------------");
		professor.receberAumento(10f);
		System.out.println("Salario: "+professor.getSalario());
		System.out.println("Salario bruto anual: "+professor.calcularBrutoAnual());
		System.out.println("-------------------");
	} // end main

} // end class
