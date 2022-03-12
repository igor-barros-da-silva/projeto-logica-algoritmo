package pacote.variavel;

public class Variavel {

	private static double total = 0;
	private static int produtos = 10;
	private static int quantidade = 15;

	private static String nome = "Igor Barros";
	private static int idade = 39;

	public static void main(String[] args) {

		total = produtos * quantidade;
		System.out.println(total);

		total = (produtos * quantidade) * 5;
		System.out.println(total);

		if (idade == 39)

		{
			System.out.println(nome);
		}

		idade = 31;

		if (idade == 31) {
			nome += "  da Silva";
			System.out.println(nome);
		}
	}

}
