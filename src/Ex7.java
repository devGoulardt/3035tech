import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float valor = tc.nextFloat();

		float fivePercent = (float) (valor * 0.05);
		float fiftyPercent = (float) (valor * 0.5);
		float oneThousandFiftyPercent = (float) (valor * 1.5);
		
		System.out.printf("%.1f\n", fivePercent);
		System.out.printf("%.2f\n", fiftyPercent);
		System.out.printf("%.3f\n", oneThousandFiftyPercent);
		
		tc.close();
	}
	
}
