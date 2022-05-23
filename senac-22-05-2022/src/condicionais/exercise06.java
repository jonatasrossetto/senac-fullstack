package condicionais;

public class exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//	ele recebe uma comissão de 3% sobre o total das vendas caso suas vendas sejam iguais ou inferiores a R$
//	1.500,00 e 5% caso ultrapasse este valor, calcular e escrever o seu salário total.

		
		double salarioBase = 1212f;
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
