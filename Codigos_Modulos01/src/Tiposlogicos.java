
public class Tiposlogicos {
	
		public static void main(String[] args) {
			Boolean variavelVerdeira = true;
			System.out.println("Variavel verdadeira:" + variavelVerdeira);
			
			Boolean variavelFalsa = false;
			System.out.println("Variavel false:" + variavelFalsa);
			
			System.out.println("---------------------------------" );
		
			Integer idade = 17;
			
			Boolean podeTirarCarteira =idade >= 18;
			
			if (podeTirarCarteira) {
				System.out.println("Sim! Ele(a) pode tirar cateira");
			} else {
				System.out.println("Não! Ele(a) não poder tirar a carteira.");
			}					
		}
}
