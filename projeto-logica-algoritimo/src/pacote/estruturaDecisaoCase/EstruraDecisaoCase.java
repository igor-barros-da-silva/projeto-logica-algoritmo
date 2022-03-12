package pacote.estruturaDecisaoCase;

public class EstruraDecisaoCase {

	public static void main(String[] args) {
		
		String media = "APROVADO";


		switch (media) {
		case "APROVADO":
			System.out.println("Aluno aprovado!");
			break;
		case "REPROVADO":
			System.out.println("Aluno reprovado!");
			break;
		default:
			break;
		}
	}
}
