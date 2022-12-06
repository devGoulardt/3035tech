import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual operação?");
		String operacao = input.next();
		System.out.println("Respectivamente, digite o valor de X e Y:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		
		System.out.println(calcular(operacao, x, y));
		
		input.close();

	}

	public static double calcular(String operacao, double x, double y) {
		
		double result = 0;
		if (operacao.equalsIgnoreCase("dividir") || operacao.equalsIgnoreCase("somar")
				|| operacao.equalsIgnoreCase("multiplicar") || operacao.equalsIgnoreCase("subtrair")) {
			switch (operacao) {
			case "somar":
				result = (x + y);
				break;
			case "multiplicar":
				result = (x * y);
				break;
			case "dividir":
				result = (x / y);
				break;
			case "subtrair":
				result = (x - y);
				break;
			}
		} else {
			System.out.println("Erro na operação, digite novamente!");
		}
		
		System.out.println("Resultado da operação de " + operacao + ":");
		return result;
	}

}
