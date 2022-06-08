package estudos2;

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
		System.out.println("regi�o do frete: "+regiaoFrete);
		System.out.println("valor final:"+valorTotal);
		
		
		// Refactoring #1 - using switch/case
		System.out.println("-----------------");
		valorProduto = 100;
		regiaoFrete = "SE";
		switch (regiaoFrete) {
			case "NE":
				valorTotal=valorProduto+freteNE;
				break;
			case "N":
				valorTotal=valorProduto+freteN;
				break;
			case "SE":
				valorTotal=valorProduto+freteSE;
				break;
			case "CO":
				valorTotal=valorProduto+freteCO;
				break;
			case "S":
				valorTotal=valorProduto+freteS;
				break;
		}
		System.out.println("valor produto: "+valorProduto);
		System.out.println("regi�o do frete: "+regiaoFrete);
		System.out.println("valor final:"+valorTotal);
		
	} // end main

} // end class
