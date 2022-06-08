package estudos2;

import java.util.Scanner;

public class exercise07a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com as horas trabalhadas: ");
		int horasTrabalhadas = input.nextInt();
		
		final double valorHoraNormal = 35;
		final double valorHoraExcesso = 50;
		final int limiteHoras = 44;
		int horasExcesso = 0;
		int horasNormais = 0;
				
		System.out.println("total de horas trabalhadas: "+horasTrabalhadas);
				
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
				
				
		System.out.println("---------------");
		System.out.println("horas normais: "+horasNormais);
		System.out.println("valor hora normal: "+valorHoraNormal);
		System.out.println("---------------");
		System.out.println("horas excedentes: "+horasExcesso);
		System.out.println("valor hora excedente: "+valorHoraExcesso);
		System.out.println("---------------");
		System.out.println("salario normal: "+(horasNormais*valorHoraNormal));
		System.out.println("salario excedente: "+(horasExcesso*valorHoraExcesso));
		System.out.println("salario excedente: "+(horasNormais*valorHoraNormal+horasExcesso*valorHoraExcesso));
				
				
				
				
	} //end main

} //end class
