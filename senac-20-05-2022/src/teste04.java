
public class teste04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precoKilo = 9.75;
		double margemLucro = 20; // em %
		double precoVenda = 0;
		double pesoBolo = 2.35; // em Kg
		
		precoVenda = (pesoBolo*precoKilo)*((1+margemLucro/100));
		
		System.out.println("Peso do bolo: "+pesoBolo);
		System.out.println("Preco por Kg: "+precoKilo);
		System.out.println("Margem de lucro: "+margemLucro);
		System.out.println("Preco de venda: "+precoVenda);

		
		
		
	} // end of main

} // end of class
