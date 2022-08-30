import java.util.Scanner;

public class EstruturasIfEx02Bonificacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print ("Digite a meta de faturamento anual da empresa :");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.print ("Digite o faturamento anual da empresa :");
		Double faturamentoAnual = scanner.nextDouble();
		
		System.out.print ("Digite a média salarial do colaborador :");
		Double mediaSalarialFuncionario = scanner.nextDouble();
		
		Double oitaPorcentoDaMeta = (metaFaturamento *80)/100;
		
		Boolean bonusTotal =  faturamentoAnual >= metaFaturamento;
		Boolean bonusParcial = metaFaturamento >= oitaPorcentoDaMeta;
		Boolean receberaBonus = bonusTotal && bonusParcial;
		Boolean naoGanhouBonus = faturamentoAnual < metaFaturamento ;
		
		if ( bonusTotal ) {
			System.out.println("Você receberá 100% do bônus R$ " + mediaSalarialFuncionario);
			
		}else if (bonusParcial) {
			
			Double oitoPorcentoDaMediaSalarial = (80 * mediaSalarialFuncionario)/100 ;
			System.out.println("Você receberá 80% do bonus" + oitoPorcentoDaMediaSalarial);
			
		} else  {
			System.out.println("Voçê não recebera bonus");
		}

	
	}

}
