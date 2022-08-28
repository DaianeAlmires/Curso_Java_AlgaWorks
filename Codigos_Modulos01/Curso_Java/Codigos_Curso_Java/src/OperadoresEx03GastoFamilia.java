import java.util.Scanner;

public class OperadoresEx03GastoFamilia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo os valores gastos com...");
		
		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Água: ");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola: ");
		total += scanner.nextDouble();
		
		System.out.print("Cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O gasto total foi de: " + total);
		
    
		Double resultado = total -2000;
		Boolean saldonegativo = total>= 2000;
		
		System.out.println("Voce esta no negativo em : " + resultado );
	
	
		scanner.close(); 
		
	}
	
}
		
		

