package estudos1;

public class teste03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int idadeAnos = 47;
				int idadeMeses = 10;
				int idadeDias = 20;
				int idadeEmDias = 0;

//				explode uma string com informacoes da idade
//				String idade = "47a10m20d";
//				System.out.println(idade);
//				String[] anos = idade.split("a");
//				String[] meses = anos[1].split("m");
//				String[] dias = meses[1].split("d");
//				System.out.println(anos[0]);
//				System.out.println(meses[0]);
//				System.out.println(dias[0]);
//				int idadeAnos = Integer.parseInt(anos[0]);
//				int idadeMeses = Integer.parseInt(meses[0]);
//				int idadeDias = Integer.parseInt(dias[0]);
				
				
				
				
				
				
				idadeEmDias = idadeAnos*365+idadeMeses*30+idadeDias;
				
				System.out.println(idadeAnos+" anos, "+idadeMeses+" meses e "+idadeDias+" dias");
				System.out.println("eh equivalente : "+idadeEmDias+" dias");
				
				
			} // end of main

		} // end of class
