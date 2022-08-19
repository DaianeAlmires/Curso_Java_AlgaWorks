import java.util.Scanner;

public class AlterandoValorVariaveis {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print( "Digite o Valor do Produto R$: " );
			 Double valorProduto  = scanner . nextDouble ();
			 
			 System.out.print( "Digite o tipo de pagamento [1= á vista / 2 = á prazo ]: " );
			 Integer tipoPagamento = scanner.nextInt();
			 
			 Boolean pagamentoAVista =tipoPagamento.equals(1);
			 
			 Double juros = 10.0;
			 
			 if (pagamentoAVista) {
				 
			 } else {
				 juros = 10.0;
			 }
			 
			 Double acrescimo =valorProduto * juros / 100;
			 
			 Double valorTotal = acrescimo + valorProduto;
			 
			 System.out.print("Valor total:" + valorTotal );
			 
			scanner.close();	
		}
}
