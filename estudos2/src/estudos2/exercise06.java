package estudos2;

public class exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salarioBase = 1212;
		double vendasTotal = 10000;
		double comissao = 0;
		double salarioFinal = 0;
		
		if (vendasTotal<=1500) {
			comissao = vendasTotal*0.03;
			salarioFinal = salarioBase+comissao;
		} //end if
		else if (vendasTotal>1500) {
			comissao = vendasTotal*0.05;
			salarioFinal = salarioBase+comissao;
		} //end else
		
		System.out.println("Salario base: "+salarioBase);
		System.out.println("Total de vendas: "+vendasTotal);
		System.out.println("Comissao: "+comissao);
		System.out.println("Salario final: "+salarioFinal);
		
	} // end main

} // end class
