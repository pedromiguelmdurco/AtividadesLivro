import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		//Declara��o das variaveis
		double salario, imposto, novo;
		
		//Leitura de dados
		System.out.print("Digite o sal�rio base: ");
		salario = entrada.nextDouble();
		
		//C�lculo do imposto
		imposto = salario*0.1; // imposto = salario*(10.0/100);
		novo = salario+50 - imposto;
		
		//Exibir informa�oes
		System.out.printf("o sal�rio a receber � de R$%.2f\n", novo);
		
		
		entrada.close();
	}

}
