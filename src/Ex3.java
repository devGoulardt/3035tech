
public class Ex3 {

	public static void main(String[] args) {
		
		retornaVogal("erick");

	}

	public static void retornaVogal(String palavra) {
		String vogaisUsadas = "";
		for (int i = 0; i < palavra.length(); i++) {
			if((palavra.charAt(i) == 97) || (palavra.charAt(i) == 65)) {
				vogaisUsadas += "a";
			}
			
			if((palavra.charAt(i) == 101) || (palavra.charAt(i) == 69)) {
				vogaisUsadas += "e";
			}
			
			if((palavra.charAt(i) == 105) || (palavra.charAt(i) == 73)) {
				vogaisUsadas += "i";
			}
			
			if((palavra.charAt(i) == 111) || (palavra.charAt(i) == 79)) { 
				vogaisUsadas += "o";
			}
			
			if((palavra.charAt(i) == 117) || (palavra.charAt(i) == 85)) { 
				vogaisUsadas += "u";
			}
		}
		
		System.out.println(vogaisUsadas);
	}

}
