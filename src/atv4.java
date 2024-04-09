import java.util.Scanner;

public class atv4 {

	public static void main(String[] args)
	{
		double salario,  // Salario do funcionario
		aumento, // Total do aumento a ser fornecido
		novo; // Novo salaraio com o aumento 
		
		//Vincula a variavel entrada ao canal de leitura do teclado
		Scanner entrada = new Scanner (System.in);
		
		// LEitura de dados
		System.out.print("Digite o salario: ");
		salario = entrada.nextDouble();
		
		//Calculo do aumento e do novo salario 
		aumento = (25.0/100)*salario;
		novo = salario + aumento;
		
		//Exibe o novo salario calculado
		System.out.printf("O novo salário é R$%.2f\n",novo);//\n da uma quebra de linha
		
		// Encerra o vinculo da varialve com o canal de leitura
		entrada.close();
	}

}
