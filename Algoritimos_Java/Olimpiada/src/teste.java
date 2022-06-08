
public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		Atleta atleta = new Atleta();
		AtletaProfissional jogador = new AtletaProfissional(); 
		
		pessoa.setNome("jonatas");
		pessoa.setTelefone("(71)9xxxx-xxxx");
		System.out.println("------------------------------------");
		System.out.println("nome: "+pessoa.getNome());
		System.out.println("telefone: "+pessoa.getTelefone());
		System.out.println(pessoa.getClass());
		System.out.println(pessoa);
		System.out.println("------------------------------------");
		
		atleta.setNome("jonatas");
		atleta.setTelefone("(71)9xxxx-xxxx");
		atleta.setModalidade("atletismo");
		atleta.setIdade(47);
		System.out.println("------------------------------------");
		System.out.println("nome: "+atleta.getNome());
		System.out.println("telefone: "+atleta.getTelefone());
		System.out.println("modalidade: "+atleta.getModalidade());
		System.out.println("idade: "+atleta.getIdade());
		System.out.println(atleta.getClass());
		System.out.println(atleta);
		System.out.println("------------------------------------");
		
		jogador.setNome("jonatas");
		jogador.setTelefone("(71)9xxxx-xxxx");
		jogador.setModalidade("atletismo");
		jogador.setIdade(47);
		jogador.setSalario(2500.00);
		System.out.println("------------------------------------");
		System.out.println("nome: "+jogador.getNome());
		System.out.println("telefone: "+jogador.getTelefone());
		System.out.println("modalidade: "+jogador.getModalidade());
		System.out.println("idade: "+jogador.getIdade());
		System.out.println("salario: "+jogador.getSalario());
		jogador.receberAumento(10f);
		System.out.println("salario+10%: "+jogador.getSalario());
		jogador.receberAumento(100);
		System.out.println("salario+$100: "+jogador.getSalario());
		System.out.println(jogador.getClass());
		System.out.println(jogador);
		System.out.println("------------------------------------");
		
	}

}
