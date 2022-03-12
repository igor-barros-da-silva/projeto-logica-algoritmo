package pacote.estruturaDecisao1;

public class EstruturaDecisao1 {

	public static void main(String[] args) {

		double n1;
		double n2;
		double n3;
		double n4;

		String APROVADO = "aprovado";
		String REPROVADO = "reprovado";

		double media = 60;

		if (media >= 70) {
			System.out.println(APROVADO);
		} else if (media < 70) {
			System.out.println(REPROVADO);
		}
	}
}
