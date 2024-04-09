import java.util.Scanner;

public class atv6Rept {

	public static void main(String[] args) {
		//Declaraçao das variaveis
		Scanner entrada = new Scanner(System.in);
		
		char codigo;
		double valor, somaAVista = 0, somaAPrazo = 0;
		
		//para cada transaçao das 15
		for(int conta = 1; conta <= 15; conta++)
		{
			
		
			//leitura do codigo e do valor
			System.out.print("Digite o codigo da transaçao (V- à vista ou P - à prazo): ");
			codigo = entrada.next().charAt(0);
			System.out.print("Digite o valor da transaçao: R$");
			valor = entrada.nextDouble();
			
			//verificar o tipo de transaçao para somar ao total
			//correspondente
			if(codigo == 'V'|| codigo == 'v')
			{
				somaAVista = somaAVista + valor;
				//somaAvista += valor;
			}
			else if(codigo == 'P' || codigo == 'p')
			{
				somaAPrazo +=valor;
			}
			else
			{
				System.out.print("Código inválido");
			}
			
		
		}
		
		//Calculo da soma das primeira parcelas
		
		
		//Exibiçao
		System.out.printf("Total à vista é de R$%.2f\n",somaAVista);
		System.out.printf("Total à prazo é de R$%.2f\n",somaAPrazo);
		System.out.printf("Total geral é de R$%.2f\n",(somaAVista + somaAPrazo));
		System.out.printf("Soma das primeiras parcelas é de R$%.2f\n", (somaAPrazo/3));
		
		entrada.close();
	}

}
