import java.util.Scanner;

public class OperadoresEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if (precisaCobrarFrete) {
			valorFinal += 15.0;
		}
		
		System.out.println("Valor final: " + valorFinal);
		
		
		scanner.close();

	}

}
