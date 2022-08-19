import java.util.Scanner;

public class ExercicioElevarQuadrado {

	public  static  void  main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "Informe um numero: " );
		 Double numero  = scanner . nextDouble ();
		
		Double Inteiroaoquadrado = numero * numero;
		
		System.out.println ( "O quadrado de " + numero + " é " + Inteiroaoquadrado + "." );
		
		scanner.close ();
	}

}
