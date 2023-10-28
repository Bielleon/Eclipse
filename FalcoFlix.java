import java.util.Scanner;

public class FalcoFlix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao FalcoFlix!!!");
		System.out.println("===============================================================");
		System.out.println("Escolha uma opção:");
		System.out.println("Cadastrar Filme - 1");
		System.out.println("Cadastrar Usuario - 2");
		System.out.println("Cadastrar Forma de pagamento - 3");
		System.out.println("Pesquisar Filme - 4");
		System.out.println("Ver Top 10 - 5");
		System.out.println("Favoritar - 6");
		System.out.println("Sair - 7");
		byte num = sc.nextByte();
		sc.close();
		
		switch (num) {
		case '1':
		System.out.println("Bem vindo para area de cadastro de filme!");
		System.out.println("Digite o nome do filme: ");
		String nome = sc.next();
		
		System.out.println("Digite a categoria do filme: ");
		String categoria = sc.next();

		System.out.println("Digite a classificação do filme: ");
		byte classificacao = sc.nextByte();
		
		System.out.println("quantos atores/atrizes?");
		int quantidadeAtores = sc.nextInt();
		 
		String atores[] = new String[quantidadeAtores];
		sc.nextLine();
		
		for(int i = 0; i < quantidadeAtores; i++) {
			System.out.println("informe os nomes:");
			atores[i] = sc.nextLine();
			System.out.println("Obrigado pelas informações!");	
		}
		
		System.out.println("Digite a duração do filme (em minutos): ");
		short duracao = sc.nextShort();

		System.out.println("Digite a quantidade de compartilhamentos: ");
		int compartilhamentos = sc.nextInt();

		System.out.println("Digite a quantidade de views: ");
		long views = sc.nextLong();

		System.out.println("Digite o ano de Lançamento: ");
		short lancamento = sc.nextShort();

		System.out.println("Digite a bilheteria do filme: ");
		double bilheteria = sc.nextDouble();

		System.out.println("Digite o orçamento do filme: ");
		float orcamento = sc.nextFloat();

		System.out.println("O filme está disponível (true/false): ");
		boolean disponivel = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Digite a o selo de qualidade: ");
		char selo = sc.nextLine().charAt(0);

		System.out.println("===============================================================");
		System.out.println("Filme cadastrado com sucesso! Aqui estão os dados:");
		System.out.println("Nome do filme: " + nome);
		System.out.println("Categoria do filme: " + categoria);
		System.out.println("Classificação do filme: " + classificacao);
		System.out.println("Duração do filme: " + duracao + " minutos");
		System.out.println("Quantidade de compartilhamentos: " + compartilhamentos);
		System.out.println("Quantidade de views: " + views);
		System.out.println("Ano de lançamento: " + lancamento);
		System.out.println("Bilheteria: " + bilheteria);
		System.out.println("Orçamento do filme: " + orcamento);
		System.out.println("O filme está disponível: " + disponivel);
		System.out.println("Selo de qualidade: " + selo);
		System.out.println("===============================================================");
			break;
		case '2':
			
			break;
		case '3':
			
			break;
		case '4':
			
			break;
		case '5':
			
			break;
		case '6':
			
			break;
		case '7':
			
			break;
			
			
		
		}

	}
}
