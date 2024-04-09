
public class atvPropostaRept2 {

	public static void main(String[] args) { 
			
		//declaraçao das variaveis
		
		double preco = 5, despesas = 200, lucro = 0;
		int quantVend = 120;
		
		lucro = (quantVend * preco - despesas);
		System.out.println("Preço\t\tQuantidade\tDespesas\tLucro");
		
		//Estrutura de repeticao while
/*		while(preco >= 1)
		{
			System.out.printf("R$%.2f\t\t%d\t\tR$%.2f\tR$%.2f\n", preco,quantVend,despesas,lucro);
			preco = preco - 0.50;
			quantVend = quantVend+26;
		
			lucro = (quantVend * preco - despesas);
		}
*/
		//for
		for(preco = 5; preco >= 1; preco-= 0.5)
		{
			lucro = (quantVend * preco - despesas);
			
			System.out.printf("R$%.2f\t\t%d\t\tR$%.2f\tR$%.2f\n", preco,quantVend,despesas,lucro);
			
			quantVend = quantVend + 26;
		}
		
	}

}
