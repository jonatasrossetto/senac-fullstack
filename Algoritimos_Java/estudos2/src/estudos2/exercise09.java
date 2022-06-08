package estudos2;

public class exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9) Crie um algoritmo onde o usu�rio leia a moeda da compra (Euro / D�lar / Libra) e o seu valor. Calcule o
//	valor da compra em reais sabendo que a cota��o � a seguinte:
//	* 1 (E)uro = R$ 3,33
//	* 1 (D)�lar = 3,17
//	* 1 (L)ibra = 3,85

		String moedaCompra = "L";
		double valorMoedaCompra = 100f;
		double valorBrl = 0;
//		String moedaCompra = "D";
//		String moedaCompra = "L";
		// E = euro
		// D = dolar
		// L = libra
		
		double eur = 3.33;
		double usd = 3.17;
		double gbp = 3.85;
		
		if (moedaCompra=="E" || moedaCompra=="e") {
			valorBrl=valorMoedaCompra*eur;
			moedaCompra="euros";
		}
		else if (moedaCompra=="D" || moedaCompra=="d") {
			valorBrl=valorMoedaCompra*usd;
			moedaCompra="dolares";
		}
		else if (moedaCompra=="L" || moedaCompra=="l") {
			valorBrl=valorMoedaCompra*gbp;
			moedaCompra="libras";
		}
		
		System.out.println("O valor original da compra foi: "+valorMoedaCompra+" "+moedaCompra);
		System.out.println("O valor da compra em reais foi: "+valorBrl+" reais");
		
		
		//Refactoring #1 - using switch/case
		System.out.println("---------------");
		moedaCompra = "uSd";
		valorMoedaCompra = 100f;
		moedaCompra = moedaCompra.toLowerCase();
		switch(moedaCompra) {
		  case ("eur"):
			  valorBrl=valorMoedaCompra*eur;
			  moedaCompra="euros";
		    break;
		  case ("usd"):
			  valorBrl=valorMoedaCompra*usd;
			  moedaCompra="dolares";
		  break;
		  case ("gbp"):
			  valorBrl=valorMoedaCompra*gbp;
			  moedaCompra="libras";
		  break;
		}
		System.out.println("O valor original da compra foi: "+valorMoedaCompra+" "+moedaCompra);
		System.out.println("O valor da compra em reais foi: "+valorBrl+" reais");
		
		
		
		
	} // end main

} // end class
