import java.util.Scanner;

public class EstruturasIfEx01 {
	
	static final Integer Nota_Minima_Portugues = 60;
	static final Integer Nota_Minima_Matematica = 60;
	static final Integer Nota_Aprovacao_Concurso = 150;
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			
			System.out.print("Digite sua nota de Português : ");
			Double notaPortugues= scanner .nextDouble();
			
			System.out.print("Digite sua nota de Matemática: ");
			Double notaMatematica= scanner .nextDouble();
			
			Double somatoria = notaPortugues + notaMatematica ;
			
			Boolean aprovadoPortugues = notaPortugues >= Nota_Minima_Portugues;
			Boolean aprovadoMatematica = notaMatematica >= Nota_Minima_Matematica;
			Boolean aprovadoNoConcurso = somatoria >= Nota_Aprovacao_Concurso;
			Boolean aprovado = aprovadoPortugues && aprovadoMatematica && aprovadoNoConcurso;
			
			if ( aprovado ) {
				System.out.println("Parabens! Voçê foi aprovado com :" + somatoria +" pontos");
			} else 	
			System.out.println ( "Reprovado(a). " + somatoria +" pontos");
			}		
			
			
		}
