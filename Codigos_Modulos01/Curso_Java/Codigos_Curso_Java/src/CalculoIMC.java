import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso (KG): ");
		Double Peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (M2): ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
				
		Double	indiceMassaCorporal = Peso / alturaAoQuadrado;  	
			
		
		System.out.println("Seu IMC é : "  + indiceMassaCorporal);
		
		scanner.close();
		}

}
