
public class Ex6 {

	public static void main(String[] args) {
		
		calculaSomaMedia(5,5,5);

	}
	
	public static void calculaSomaMedia(double x, double y, double z) {
		
		double soma = x + y + z;
		double media = soma/3;
		System.out.printf("A soma deu: %.2f\n", soma);
		System.out.printf("A media deles é de: %.2f", media);
		
	}

}
