
public class Ex1 {

	public static void main(String[] args) {
		int[] vetorNumero = {1,2,3,4,5,6,7};
		
		maior(vetorNumero);

	}
 
	public static void maior(int[] vetorNumero) {
		int maior = Integer.MIN_VALUE;
		int indice = 0;
		
		for(int i = 0; i < vetorNumero.length; i++) {
			if(vetorNumero[i] > maior) {
				maior = vetorNumero[i];
				indice = i;
			}
		}
		System.out.println("O maior valor é: " + maior + " e seu índice é " 
		+ indice);
	}

}
