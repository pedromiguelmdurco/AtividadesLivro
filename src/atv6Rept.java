import java.util.Scanner;

public class atv6Rept {

	public static void main(String[] args) {
		//Declara�ao das variaveis
		Scanner entrada = new Scanner(System.in);
		
		char codigo;
		double valor, somaAVista = 0, somaAPrazo = 0;
		
		//para cada transa�ao das 15
		for(int conta = 1; conta <= 15; conta++)
		{
			
		
			//leitura do codigo e do valor
			System.out.print("Digite o codigo da transa�ao (V- � vista ou P - � prazo): ");
			codigo = entrada.next().charAt(0);
			System.out.print("Digite o valor da transa�ao: R$");
			valor = entrada.nextDouble();
			
			//verificar o tipo de transa�ao para somar ao total
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
				System.out.print("C�digo inv�lido");
			}
			
		
		}
		
		//Calculo da soma das primeira parcelas
		
		
		//Exibi�ao
		System.out.printf("Total � vista � de R$%.2f\n",somaAVista);
		System.out.printf("Total � prazo � de R$%.2f\n",somaAPrazo);
		System.out.printf("Total geral � de R$%.2f\n",(somaAVista + somaAPrazo));
		System.out.printf("Soma das primeiras parcelas � de R$%.2f\n", (somaAPrazo/3));
		
		entrada.close();
	}

}
