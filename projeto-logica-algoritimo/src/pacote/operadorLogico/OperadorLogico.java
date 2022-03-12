package pacote.operadorLogico;

public class OperadorLogico {

	private static boolean n1 = false;
	private static boolean n2 = false;
	private static boolean n3 = true;

	public static void main(String[] args) {

		if (n1 && n2 | n3) {

			System.out.println("Entrou na condição");
		}
	}

}
