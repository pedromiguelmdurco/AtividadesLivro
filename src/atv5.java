import java.util.Scanner;

public class atv5 {

	public static void main(String[] args)
	{
		//Declaraçoes das variaveis
		Scanner entrada = new Scanner (System.in);
		
		double salario, percentual, novo, aumento;
		
		//leitura dos daods
		System.out.println("Digite o valor do salário: ");
		salario = entrada.nextDouble();
		
		System.out.println("Digite o valor percentual do aumento: ");
		percentual = entrada.nextDouble();
		
		//Calculo do aumento e do novo salario
		aumento = (percentual/100)*salario;
		novo = salario + aumento;
		
		//Exibir as informaçoes
		System.out.printf("Para o salario R$%.2f, o aumento" +
		" foi de R$%.2f e o novo salario é de R$%.2f\n"
				, salario, aumento, novo);
		
		
		entrada.close();

	}

}
