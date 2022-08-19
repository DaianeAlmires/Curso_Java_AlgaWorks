import java.util.Scanner;

//Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

//Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.

//Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você multiplica o subtotal pelo próprio percentual e divide tudo por 100.

//Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total final e deverá ser apresentado no console.

public class ExercicioValorUnitarioXQuantidade {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print( "Digite o Valor do Produto R$: " );
			 Double valorProduto  = scanner . nextDouble ();
			 
			 System.out.print( "Digite a quantidade desejada:" );
			 Integer quantidadeDeProduto = scanner.nextInt();
			 
			 Double valorBruto = valorProduto * quantidadeDeProduto;
			 
			 System.out.print("Valor total:" + valorBruto );
			
				Boolean desconto = quantidadeDeProduto>= 10;
				
				 Double porcentagem = 10.0;
				
				System.out.println("");
				
				if (desconto) {
					System.out.println("Parabens vc ganhou 10% de desconto...");
					porcentagem = 10.0;
					
					Double valorComDesconto= valorBruto * porcentagem/100;
					
					Double valorTotal = valorBruto - valorComDesconto;
					
					System.out.print("Valor a pagar: R$ " + valorTotal);
					
				} else{
					System.out.println("Para receber o desconto adicione mais itens ao carinho.");
					porcentagem = 0.0;
					
				}	
				
				
				
				scanner.close();	
		}		 
		
	}

