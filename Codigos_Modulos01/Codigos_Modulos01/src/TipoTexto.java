import java.util.Scanner;

public class TipoTexto {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
		System.out.print( "Digite seu Nome:" );
		String nome = scanner.nextLine();
		

		System.out.print( "Digite seu Sobrenome:" );
		String sobrenome = scanner.nextLine();
		
		
		System.out.println("Olá "  +nome+ sobrenome + " bem vindo(a) ao nosso site ! " );
		
		scanner.close();
		
		
	}

}
