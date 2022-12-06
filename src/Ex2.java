
public class Ex2 {

	public static void main(String[] args) {
		
		inverteString("sapo sapo");

	}
	
	public static void inverteString(String palavra) {
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			char invertida = palavra.charAt(i);
			System.out.print(invertida);
		}
	}

}
