package condicionais;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double valorProduto = 100;
		String regiaoFrete = "NE";
		double valorTotal = 0;
		
		double freteNE = 200;
		double freteN= 250;
		double freteSE=85;
		double freteCO=180;
		double freteS=150;

		if (regiaoFrete=="NE") {
			valorTotal=valorProduto+freteNE;
		}
		else if (regiaoFrete=="N") {
			valorTotal=valorProduto+freteN;
		}
		else if (regiaoFrete=="SE") {
			valorTotal=valorProduto+freteSE;
		}
		else if (regiaoFrete=="CO") {
			valorTotal=valorProduto+freteCO;
		}
		else if (regiaoFrete=="S") {
			valorTotal=valorProduto+freteS;
		}
		
		System.out.println("valor produto: "+valorProduto);
		System.out.println("região do frete: "+regiaoFrete);
		System.out.println("valor final:"+valorTotal);
		
	}

}
