import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		//Declaração das variaveis
		double salario, imposto, novo;
		
		//Leitura de dados
		System.out.print("Digite o salário base: ");
		salario = entrada.nextDouble();
		
		//Cálculo do imposto
		imposto = salario*0.1; // imposto = salario*(10.0/100);
		novo = salario+50 - imposto;
		
		//Exibir informaçoes
		System.out.printf("o salário a receber é de R$%.2f\n", novo);
		
		
		entrada.close();
	}

}
