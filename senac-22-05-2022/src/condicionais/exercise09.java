package condicionais;

public class exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9) Crie um algoritmo onde o usu�rio leia a moeda da compra (Euro / D�lar / Libra) e o seu valor. Calcule o
//	valor da compra em reais sabendo que a cota��o � a seguinte:
//	* 1 (E)uro = R$ 3,33
//	* 1 (D)�lar = 3,17
//	* 1 (L)ibra = 3,85

		String moedaCompra = "usd";
		double valorMoedaCompra = 100f;
		double valorBrl = 0;
//		String moedaCompra = "usd";
//		String moedaCompra = "gbp";
		
		double eur = 3.33;
		double usd = 3.17;
		double gbp = 3.85;
		
		if (moedaCompra=="eur") {
			valorBrl=valorMoedaCompra*eur;
		}
		else if (moedaCompra=="usd") {
			valorBrl=valorMoedaCompra*usd;
		}
		else if (moedaCompra=="gbp") {
			valorBrl=valorMoedaCompra*gbp;
		}
		
		System.out.println("O valor original da compra foi: "+valorMoedaCompra+" "+moedaCompra);
		System.out.println("O valor da compra em reais foi: "+valorBrl+" brl");
		
		
		
	}

}
