import java.util.Scanner;

public class ExercicioNotaAluno {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print( "Informe a nota: " );
			 Double nota = scanner . nextDouble ();
			
			System.out.println("---------------------------------" );
		
			Boolean aprovado = nota>= 70;
			
			if (aprovado) {
				System.out.println("Parabéns! Aprovado (+.+)");
			} else {
				System.out.println("Reprovado ! Tente novamente...");
			}	
		}

}
