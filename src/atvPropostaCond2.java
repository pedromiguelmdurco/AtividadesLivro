import java.util.Scanner;

public class atvPropostaCond2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declara�ao de variaveis
		
		double notap1, notap2, media;
		char opcao = 's';
		
		//Leitura das notas
	while(opcao == 's' || opcao == 'S') 
	{
		System.out.print("Digite a nota da primeira prova: ");
		notap1 = entrada.nextDouble();
		System.out.print("Digite a nota da segunda prova: ");
		notap2 = entrada.nextDouble();
		
		//Calculo da media
		
		media = (notap1 + notap2)/2;
		
		//Exibir media
		
		System.out.printf("A m�dia das notas � %.2f\n",media);
		
		//Exibir mensagem
		if(media < 0)
		{
			System.out.println("Valor invalido");
		}
		else if(media < 3)
		{
			System.out.println("Reprovado direto, sem reavalia�ao");
		}
		else if( media < 7)
		{
			System.out.println("Deve fazer a prova de Reavalia��o");
		}
		else if(media < 10)
		{
			System.out.println("Aprovado");
		}
		else
		{
			System.out.println("Valores acima de 10 n�o s�o aceitos");
		}
		
		System.out.print("Vai querer reiniciar o programa(s/n)?");
		opcao = entrada.next().charAt(0);
		
	}
		System.out.println("Fim do programa");
		entrada.close();

	}

}
