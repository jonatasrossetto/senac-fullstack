package condicionais;

public class exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		7) Elabore um Algoritmo que leia o n�mero de horas semanais trabalhadas de um programador. Calcule o
//	sal�rio sabendo-se que ele ganha R$35,00 por hora. Quando o n�mero de horas excederem a 44 calcule o
//	excesso de pagamento armazenando-o na vari�vel Excesso, caso contr�rio zerar tal vari�vel. A hora
//	excedente de trabalho vale R$ 50,00. No final do processamento imprimir o sal�rio total e o sal�rio
//	excedente.
		
		
		int horasTrabalhadas = 50;
		final double valorHoraNormal = 35;
		final double valorHoraExcesso = 50;
		final int limiteHoras = 44;
		int horasExcesso = 0;
		int horasNormais = 0;
		
		
		if (horasTrabalhadas>limiteHoras) {
			System.out.println("Trabalhou mais de 44horas");
			horasExcesso = horasTrabalhadas - limiteHoras;
			horasNormais = limiteHoras;
		} //end if
		else {
			System.out.println("Trabalhou 44horas ou menos");
			horasExcesso = 0;
			horasNormais = horasTrabalhadas;
		} // end else
		
		System.out.println("horas normais: "+horasNormais);
		System.out.println("horas excedentes: "+horasExcesso);
		System.out.println("salario normal: "+(horasNormais*valorHoraNormal));
		System.out.println("salario excedente: "+(horasExcesso*valorHoraExcesso));
		
		
		
		
	} //end main

} //end class
